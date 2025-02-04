package com.entity.eclipse.modules.render;

import com.entity.eclipse.modules.Module;
import com.entity.eclipse.modules.ModuleType;
import com.entity.eclipse.utils.events.render.RenderEvent;
import com.entity.eclipse.utils.types.BooleanValue;

public class ItemInfo extends Module {


    public ItemInfo() {
        super("ItemInfo", "Shows info about your held item in the bottom left.", ModuleType.RENDER);

        this.config.create("ShowOffhand", new BooleanValue(false));
    }

    @Override
    public void tick() {

    }

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

    @Override
    public void renderWorld(RenderEvent event) {

    }

    @Override
    public void renderScreen(RenderEvent event) {

    }
}
