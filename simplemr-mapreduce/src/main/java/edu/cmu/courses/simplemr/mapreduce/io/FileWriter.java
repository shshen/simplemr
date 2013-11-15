package edu.cmu.courses.simplemr.mapreduce.io;

import java.io.IOException;

public abstract class FileWriter {
    protected String file;

    public FileWriter(String file){
        this.file = file;
    }

    public abstract void open() throws Exception;
    public abstract void close() throws Exception;
    public abstract void writeLine(String line) throws Exception;
}