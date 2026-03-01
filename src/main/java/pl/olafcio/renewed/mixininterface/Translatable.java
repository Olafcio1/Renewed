package pl.olafcio.renewed.mixininterface;

public interface Translatable {
    String getTranslationKey();

    default String getUseKey() {
        return getTranslationKey();
    }
}
