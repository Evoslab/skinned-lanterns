package at.nuxnux.skinnedlanterns.data;

import at.nuxnux.skinnedlanterns.SkinnedLanterns;
import at.nuxnux.skinnedlanterns.data.basic.SkinnedStates;
import at.nuxnux.skinnedlanterns.data.basic.SkinnedTables;
import me.shedaniel.cloth.api.datagen.v1.DataGeneratorHandler;
import me.shedaniel.cloth.api.datagen.v1.LootTableData;
import me.shedaniel.cloth.api.datagen.v1.ModelStateData;
import org.apache.logging.log4j.Level;

import java.nio.file.Paths;

public class SkinnedDataGen {
    public static final DataGeneratorHandler handler = DataGeneratorHandler.create(Paths.get("./src/generated/resources"));

    public static void init() {
        ModelStateData modelStates = handler.getModelStates();
        LootTableData tables = handler.getLootTables();

        SkinnedStates.init(modelStates);
        SkinnedTables.init(tables);

        SkinnedLanterns.log(Level.INFO, "SkinnedDataGen Loaded!");
    }
}