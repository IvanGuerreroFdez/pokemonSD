public class AbstractTest {
    public static void main(String[] args) {
        AbstractFactoryGen1 gen1 = new AbstractFactoryGen1();
        AbstractFactoryGen2 gen2 = new AbstractFactoryGen2();
        AbstractFactoryGen3 gen3 = new AbstractFactoryGen3();
        AbstractFactoryGen4 gen4 = new AbstractFactoryGen4();
        AbstractFactoryGen5 gen5 = new AbstractFactoryGen5();
        AbstractFactoryGen6 gen6 = new AbstractFactoryGen6();
        AbstractFactoryGen7 gen7 = new AbstractFactoryGen7();
        AbstractFactoryGen8 gen8 = new AbstractFactoryGen8();
        AbstractFactoryGen9 gen9 = new AbstractFactoryGen9();

        System.out.println("Gen1:");
        gen1.createGrass();
        gen1.createFire();
        gen1.createWater();
        System.out.println("Gen2:");
        gen2.createGrass();
        gen2.createFire();
        gen2.createWater();
        System.out.println("Gen3:");
        gen3.createGrass();
        gen3.createFire();
        gen3.createWater();
        System.out.println("Gen4:");
        gen4.createGrass();
        gen4.createFire();
        gen4.createWater();
        System.out.println("Gen5:");
        gen5.createGrass();
        gen5.createFire();
        gen5.createWater();
        System.out.println("Gen6:");
        gen6.createGrass();
        gen6.createFire();
        gen6.createWater();
        System.out.println("Gen7:");
        gen7.createGrass();
        gen7.createFire();
        gen7.createWater();
        System.out.println("Gen8:");
        gen8.createGrass();
        gen8.createFire();
        gen8.createWater();
        System.out.println("Gen9:");
        gen9.createGrass();
        gen9.createFire();
        gen9.createWater();
    }
}
