package org.example.ejercicio7;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ToDoItemTest {

        private ToDoItem tareaIniciada;
        private ToDoItem tareaSinIniciar;
        private ToDoItem tareaTerminada;
        private ToDoItem tareaPausada;


        @BeforeEach
        public void setUp() throws Exception {
            this.tareaIniciada = new ToDoItem("tarea1");
            this.tareaSinIniciar = new ToDoItem("tarea2");
            this.tareaTerminada = new ToDoItem("tarea3");
            this.tareaPausada = new ToDoItem("tarea4");
            this.tareaIniciada.start();
            this.tareaTerminada.start();
            this.tareaTerminada.finish();
            this.tareaPausada.start();
            this.tareaPausada.togglePause();
        }

        @Test
        public void testStart() {
            assertTrue(this.tareaIniciada.getEstado() instanceof InProgress);
            assertTrue(this.tareaSinIniciar.getEstado() instanceof Pending);
            this.tareaTerminada.start();
            assertTrue(this.tareaTerminada.getEstado() instanceof Finished);
            this.tareaPausada.start();
            assertTrue(this.tareaPausada.getEstado() instanceof Paused);
        }

        @Test
        public void testTogglePause() {
            this.tareaPausada.togglePause();
            assertTrue(this.tareaPausada.getEstado() instanceof InProgress);
            this.tareaIniciada.togglePause();
            assertTrue(this.tareaIniciada.getEstado() instanceof Paused);
            Exception exceptionFinished = assertThrows(RuntimeException.class, () -> {this.tareaTerminada.togglePause();});
            assertEquals("No se puede pausear una tarea en estado Finalizado, el objeto ToDoItem debe encontrarse en estado in-progress o paused",exceptionFinished.getMessage());
            Exception exceptionPending = assertThrows(RuntimeException.class, () -> {this.tareaSinIniciar.togglePause();});
            assertEquals("No se puede pausear una tarea en estado Pendiente, el objeto ToDoItem debe encontrarse en estado in-progress o paused",exceptionPending.getMessage());
        }

        @Test
        public void testFinished() {
            assertTrue(this.tareaTerminada.getEstado() instanceof Finished);
            this.tareaIniciada.finish();
            assertTrue(this.tareaIniciada.getEstado() instanceof Finished);
            this.tareaSinIniciar.finish();
            assertTrue(this.tareaSinIniciar.getEstado() instanceof Pending);
            this.tareaPausada.finish();
            assertTrue(this.tareaPausada.getEstado() instanceof Finished);

        }

        @Test
        public void testWorkedTime() {
            Exception exceptionPending = assertThrows(RuntimeException.class, () -> {this.tareaSinIniciar.workedTime();});
            assertEquals("La tarea no ha sido iniciada aun, se encuentra en estado pendiente",exceptionPending.getMessage());
            this.tareaTerminada.setInicio(LocalDateTime.of(2023, 3, 31, 15, 32, 0));
            this.tareaTerminada.setFin(LocalDateTime.of(2023, 3, 31, 16, 32, 30));
            assertEquals(3630,this.tareaTerminada.workedTime().getSeconds());
        }

        @Test
        public void testAddComment() {
            this.tareaIniciada.addComment("Hola esto es un comentario");
            this.tareaIniciada.addComment("Hola esto es 2do comentario");
            assertEquals("Hola esto es un comentario",this.tareaIniciada.getComentarios().get(0));
            assertEquals("Hola esto es 2do comentario",this.tareaIniciada.getComentarios().get(1));

            this.tareaSinIniciar.addComment("Hola esto es un comentario");
            this.tareaSinIniciar.addComment("Hola esto es 2do comentario");
            assertEquals("Hola esto es un comentario",this.tareaSinIniciar.getComentarios().get(0));
            assertEquals("Hola esto es 2do comentario",this.tareaSinIniciar.getComentarios().get(1));

            this.tareaPausada.addComment("Hola esto es un comentario");
            this.tareaPausada.addComment("Hola esto es 2do comentario");
            assertEquals("Hola esto es un comentario",this.tareaPausada.getComentarios().get(0));
            assertEquals("Hola esto es 2do comentario",this.tareaPausada.getComentarios().get(1));

            this.tareaTerminada.addComment("Hola esto es un comentario");
            assertEquals(0,this.tareaTerminada.getComentarios().size());
        }


}
