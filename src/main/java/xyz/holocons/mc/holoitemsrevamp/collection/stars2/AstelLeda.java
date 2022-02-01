package xyz.holocons.mc.holoitemsrevamp.collection.stars2;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.jetbrains.annotations.NotNull;
import xyz.holocons.mc.holoitemsrevamp.collection.Idol;

import java.util.List;

public class AstelLeda extends Idol {

    private static final String name = "astelleda";
    private static final String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2MyNzRiZDdmMjdlMDc4NzE0NjAxMzI3MTQ2MzZhNzE2ZGQ2MTk4MmEyNzUxOTc3MjE2YTljYmZjZGQ5YWJiNCJ9fX0=";

    public AstelLeda() {
        super(name, base64);
    }

    @Override
    public @NotNull Component getDisplayName() {
        return Component.text("Astel Leda")
                .color(TextColor.color(0x0B55BB))
                .decoration(TextDecoration.BOLD, true)
                .decoration(TextDecoration.ITALIC, false);
    }

    @Override
    public List<Component> getLore() {
        return null;
    }
}
