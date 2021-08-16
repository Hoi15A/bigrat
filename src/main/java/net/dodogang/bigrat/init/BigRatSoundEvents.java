package net.dodogang.bigrat.init;

import net.dodogang.bigrat.BigRat;
import net.dodogang.bigrat.entity.BigRatEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BigRatSoundEvents {
    public static final Identifier ENTITY_BIG_RAT_AMBIENT_ID = new Identifier("big_rat:ambient");
    public static final SoundEvent ENTITY_BIG_RAT_AMBIENT = new SoundEvent(ENTITY_BIG_RAT_AMBIENT_ID);

    //public static final Identifier ENTITY_BIG_RAT_AMBIENT_BABY_ID = new Identifier("big_rat:ambient");
    //public static final SoundEvent ENTITY_BIG_RAT_AMBIENT_BABY = new SoundEvent(ENTITY_BIG_RAT_AMBIENT_ID);

    public static final Identifier ENTITY_BIG_RAT_HURT_ID = new Identifier("big_rat:entity.hurt");
    public static final SoundEvent ENTITY_BIG_RAT_HURT = new SoundEvent(ENTITY_BIG_RAT_HURT_ID);


    public static final Identifier ENTITY_BIG_RAT_STEP_ID = new Identifier("big_rat:step");
    public static final SoundEvent ENTITY_BIG_RAT_STEP = new SoundEvent(ENTITY_BIG_RAT_STEP_ID);


    public static final Identifier ENTITY_BIG_RAT_WARNING_ID = new Identifier("big_rat:warning");
    public static final SoundEvent ENTITY_BIG_RAT_WARNING = new SoundEvent(ENTITY_BIG_RAT_WARNING_ID);

    public static final Identifier ENTITY_BIG_RAT_DEATH_ID = new Identifier("big_rat:death");
    public static final SoundEvent ENTITY_BIG_RAT_DEATH = new SoundEvent(ENTITY_BIG_RAT_DEATH_ID);

//    private static SoundEvent createBigRatSound(String id) {
//        return createEntitySound(BigRatEntity.id, id);
//    }
//
//    private static SoundEvent createEntitySound(String entity, String id) {
//        return register("entity." + entity + "." + id);
//    }
//
//    private static SoundEvent register(String id) {
//        Identifier identifier = new Identifier(BigRat.MOD_ID, id);
//        return Registry.register(Registry.SOUND_EVENT, identifier, new SoundEvent(identifier));
//    }

    public static void init(){
        Registry.register(Registry.SOUND_EVENT, BigRatSoundEvents.ENTITY_BIG_RAT_AMBIENT_ID, ENTITY_BIG_RAT_AMBIENT);
        //Registry.register(Registry.SOUND_EVENT, BigRatSoundEvents.ENTITY_BIG_RAT_AMBIENT_ID, ENTITY_BIG_RAT_AMBIENT_BABY);
        Registry.register(Registry.SOUND_EVENT, BigRatSoundEvents.ENTITY_BIG_RAT_HURT_ID, ENTITY_BIG_RAT_HURT);
        Registry.register(Registry.SOUND_EVENT, BigRatSoundEvents.ENTITY_BIG_RAT_WARNING_ID, ENTITY_BIG_RAT_WARNING);
        Registry.register(Registry.SOUND_EVENT, BigRatSoundEvents.ENTITY_BIG_RAT_DEATH_ID, ENTITY_BIG_RAT_DEATH);
    }
}
