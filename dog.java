class array{
    public static void main(String[] args){
        String[] dogbreed = {
            "puddel", "labrador", "spaniel"
        };

        System.out.println(dogbreed[0]);
        int counter = 0;
        counter++;
        ++counter;
        System.out.println(counter);
        int dogbreeds = 3;
        if(counter == dogbreeds)
            System.out.println("counter == dogbreeds");
        if(counter != dogbreeds)
            System.out.println("counter != dogbreeds");
        if(counter < dogbreeds)
            System.out.println("counter < dogbreeds");
        if((counter != dogbreeds) && (counter < dogbreeds))
            System.out.println("counter != dogbreeds and counter < dogbreeds");
        if((counter != dogbreeds) || (counter < dogbreeds))
            System.out.println("counter != dogbreeds and counter < dogbreeds");
        if(counter == dogbreeds) {
            System.out.println("counter == dogbreeds");
        } else {
            System.out.println("counter != dogbreeds");
        }
    }
}
