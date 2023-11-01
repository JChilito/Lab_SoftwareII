package com.mycompany.is2laboratorio7;
/**
 * Client class
 * @author Jose David Chilito Cometa <jdchilito@unicauca.edu.co>
 * @author Katherin Alexandra Zuñiga Morales <kzunigam@unicauca.edu.co>
 */
public class Client {
    private String name;
    private int id;
    private IPackage pack;

    /**
     * Parameterized builder
     * @param name Client name
     * @param id Client id
     * @param pack Travel package
     */
    public Client(String name, int id, IPackage pack) {
        this.name = name;
        this.id = id;
        this.pack = pack;
    }

    /**
     * getName
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * setName
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getId
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * setId
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * getPack
     * @return pack
     */
    public IPackage getPack() {
        return pack;
    }

    /**
     * setPack
     * @param pack 
     */
    public void setPack(IPackage pack) {
        this.pack = pack;
    }
}
