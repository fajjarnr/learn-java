package programmer.application;

public class StackTraceApp {
    public static void main(String[] args) {
//        try {
//            String[] names = {
//                    "Fajar", "Nur", "Rohman"
//            };
//            System.out.println(names[100]);
//        }catch (Throwable throwable){
//            StackTraceElement[] stackTraceElements = throwable.getStackTrace();
//
//            // agar lebih mudah
//            throwable.printStackTrace();
//        }

        try{
            sampleError();
        }catch (RuntimeException exception){
            exception.printStackTrace();
        }
    }

    public static void sampleError(){
        try {
            String[] names = {
                    "Fajar", "Nur", "Rohman"
            };
            System.out.println(names[100]);
        }catch (Throwable throwable){
            throw new RuntimeException(throwable);
        }
    }
}
