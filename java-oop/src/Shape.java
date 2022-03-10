class Shape {
    int getCorner(){
        return 0;
    }
}

class Rectangle extends Shape{
    int getCorner(){
        return 4;
    }

    /**
     * super
     * untuk mengakses method di class parent
     */
    int getParentCorner(){
        return super.getCorner();
    }
}
