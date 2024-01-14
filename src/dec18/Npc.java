package dec18;

public class Npc implements ICombattre{
    @Override
    public void attaquer() {
        System.out.println("Npc attacks");
    }

    @Override
    public void seDefendre() {
        System.out.println("Npc defends");
    }
}