package simo.devsid.Utility;

import simo.devsid.entities.Operation;

import java.util.List;

public class PageOperation {
    private List<Operation> operations;
    private int page;
    private int operationsNumberperPage;
    private int totalOperations;
    private int totalPages;

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getOperationsNumberperPage() {
        return operationsNumberperPage;
    }

    public void setOperationsNumberperPage(int operationsNumberperPage) {
        this.operationsNumberperPage = operationsNumberperPage;
    }

    public int getTotalOperations() {
        return totalOperations;
    }

    public void setTotalOperations(int totalOperations) {
        this.totalOperations = totalOperations;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
