package xyz.holocons.mc.holoitemsrevamp.collection.gen2;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.jetbrains.annotations.NotNull;
import xyz.holocons.mc.holoitemsrevamp.collection.Idol;

import java.util.List;

public class YuzukiChoco extends Idol {

    private static final String name = "yuzukichoco";
    private static final String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjFkOGI0Njg4ZGUyNGFkZDFjYTkwNmVkOGEyYmVhOWYzYTVjZTI0MTZkMjk4ZTI1YmUwNzJjZTAzYjUwYTY1MSJ9fX0=";

    public YuzukiChoco() {
        super(name, base64);
    }

    @Override
    public @NotNull Component getDisplayName() {
        return Component.text("Yuzuki Choco")
                .color(TextColor.color(0xDA5884))
                .decoration(TextDecoration.BOLD, true)
                .decoration(TextDecoration.ITALIC, false);
    }

    @Override
    public List<Component> getLore() {
        return null;
    }
}
