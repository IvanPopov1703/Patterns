package structural_patterns.facade;

public class RunFacade {

    public static void main(String[] args) {
        NetworkPowerLevelSensor networkPowerLevelSensor = new NetworkPowerLevelSensor();
        FuelLevelSensor fuelLevelSensor = new FuelLevelSensor();
        GasolinePump gasolinePump = new GasolinePump();
        Starter starter = new Starter();

        EngineStartingFacade engineStartingFacade = new EngineStartingFacade(
                networkPowerLevelSensor,
                fuelLevelSensor,
                gasolinePump,
                starter
        );

        engineStartingFacade.engineStarting();
    }
}
