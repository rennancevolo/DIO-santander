public class PetMachine {

    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;

    private Pet pet;

    public void takeAShower(){
        if(this.pet == null){
            System.out.println("Coloque o pet na máquina para iniciar o banho");
            return;
        }

        if(getWater() < 2 || getShampoo() < 2)
        {
            System.out.println("A maquina nao está abastecida, esta faltando agua ou shampoo");
            System.out.printf("\nagua: %s \n shampoo: %s\n", getWater(), getShampoo());
            return;
        }

        if(this.pet.isClean())
        {
            System.out.println("O pet ja está limpo, não precisa do banho");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.printf("\nO pet %s esta limpo \n", pet.getName());
    }

    public void addWater(){
        if(water == 30)
        {
            System.out.println("A capacidade de água da maquina está máximo");
            return;
        }

        System.out.println("Água colocada com sucesso");
        water += 2;
    }

    public void addShampoo(){
        if(shampoo == 30)
        {
            System.out.println("A capacidade de shampoo da maquina está máximo");
            return;
        }
        System.out.println("Shampoo colocado com sucesso");
        shampoo += 2;
    }

    public int getWater(){
        return water;
    }

    public int getShampoo(){
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet){
        if(!this.clean){
            System.out.println("A máquina está suja, para colocar o pet é necessario limpa-la");
            return;
        }
        if(hasPet()){
            System.out.printf("\nO pet %s esta na maquina neste momento\n", this.pet.getName());
            return;
        }

        this.pet = pet;
    }

    public void removePet(){
        if(!this.pet.isClean()) this.clean = false;
        System.out.println("O pet "+ this.pet.getName() +" está limpo");
        this.pet = null;
    }

    public void washMachine(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina foi limpa");
    }

}
