package structural_patterns.facade;

public class EngineStartingFacade {

    private final NetworkPowerLevelSensor networkPowerLevelSensor;
    private final FuelLevelSensor fuelLevelSensor;
    private final GasolinePump gasolinePump;
    private final Starter starter;

    public EngineStartingFacade(
            NetworkPowerLevelSensor networkPowerLevelSensor,
            FuelLevelSensor fuelLevelSensor,
            GasolinePump gasolinePump,
            Starter starter
    ) {
        this.networkPowerLevelSensor = networkPowerLevelSensor;
        this.fuelLevelSensor = fuelLevelSensor;
        this.gasolinePump = gasolinePump;
        this.starter = starter;
    }

    public void engineStarting() {
        networkPowerLevelSensor.checkPowerLevelInNetwork();
        fuelLevelSensor.fuelLevelCheck();
        gasolinePump.pumpUpGasoline();
        starter.starterStart();
    }
}
