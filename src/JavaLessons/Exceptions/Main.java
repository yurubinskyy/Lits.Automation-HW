package Exceptions;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
//        main.findOne(1);
        try {
            System.out.println("let's try exception");
            main.findOne(2);
            main.getFullPath("short");
            System.out.println("Exception like a piece of cake");
        } catch(NotFoundException e) {
            System.out.println("we got exception 1 " + e.getMessage());
        } catch (WrongPathException e) {
            System.out.println("we got exception 2 " + e.getMessage());
        }finally {
            System.out.println("Yeah finally really works");
        }

        System.out.println("code after exception");
    }

    public String findOne(int id) throws NotFoundException{
        if (id == 1) {
            throw new NotFoundException("Entity with id: " + 1 + " does not exists");
        }
        System.out.println("Entity with id:" + id);
        return "Entity with id:" + id;
    }

    public String getFullPath(String path) throws WrongPathException{
        if("short".equals(path)) {
            throw new WrongPathException("Wrong path, please contact administrator");
        }
        System.out.println("Full path");
        return "Full path";
    }

    public void throwException(String s) throws NotFoundException, WrongPathException {
        System.out.println("run some code before exception");
        if ("exception".equals(s)) {
            throw new NotFoundException("Exception works fine");
        } else if ("second".equals(s)) {
            throw new WrongPathException("This is our second exception.");
        }
        System.out.println("run some come after exception");
    }
}
