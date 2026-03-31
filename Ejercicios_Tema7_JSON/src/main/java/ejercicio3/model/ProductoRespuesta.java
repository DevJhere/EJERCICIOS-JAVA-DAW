package ejercicio3.model;

import ejercicio2.model.Producto;

import java.util.List;

@lombok.Data
public class ProductoRespuesta {
    private List<Producto> products;
    private long total;
    private long skip;
    private long limit;
}