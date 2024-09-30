package org.example.controllers;

import org.example.connection.DatabaseConnection;
import org.example.entities.Libro;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;


public class LibroDao {
    private DatabaseConnection databaseConnection;

    public LibroDao(){
        this.databaseConnection = new DatabaseConnection();
    }

    //metodo para guardar datos nuevos
    public  void crearLibro(Libro libro){
        Transaction transaction = null;
        try(Session session = databaseConnection.getSession()){
            transaction = session.beginTransaction();
            session.save(libro);
            transaction.commit();
        }catch (Exception e){
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    //metodo para obtener el libro por id
    public Libro obtenerLibroId(int id){
        try(Session session = databaseConnection.getSession()) {
            return session.get(Libro.class, id);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    //metodo para obtener todos los libros
    public List<Libro> obtenerLibro(){
        try(Session session = databaseConnection.getSession()){
            return session.createNativeQuery("select * from libro", Libro.class).getResultList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    //método para actualizar una persona
    public void actualizarLibro(Libro libro){
        Transaction transaction = null;
        try (Session session = databaseConnection.getSession()) {
            transaction = session.beginTransaction();
            session.update(libro);
            transaction.commit();
        }catch (Exception e){
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();

        }
    }

    //método para elimiar un libro
    public void eliminarLibro(int id) {
        Transaction transaction = null;
        try (Session session = databaseConnection.getSession()) {
            transaction = session.beginTransaction();
            Libro libro = session.get(Libro.class, id);
            if (libro != null) {
                session.delete(libro);
                System.out.println("Libro eliminado exitosamente.");
            } else {
                System.out.println("No se encontró el libro con el ID proporcionado.");
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}