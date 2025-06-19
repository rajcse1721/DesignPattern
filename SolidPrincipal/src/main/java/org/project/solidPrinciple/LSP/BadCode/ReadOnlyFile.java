package org.project.solidPrinciple.LSP.BadCode;

public class ReadOnlyFile extends File{
    public  void write(){
        throw new UnsupportedOperationException("cannt write to a read only file");
    }
}
