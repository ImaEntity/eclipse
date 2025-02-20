package com.entity.eclipse.modules.movement;

import com.entity.eclipse.modules.Module;
import com.entity.eclipse.modules.ModuleType;
import com.entity.eclipse.utils.events.render.RenderEvent;
import com.entity.eclipse.utils.types.BooleanValue;

public class SafeWalk extends Module {
    public SafeWalk() {
        super("SafeWalk", "Doesn't let you fall of the edge of blocks.", ModuleType.MOVEMENT);

        this.config.create("SafeWalkInLiquid", new BooleanValue(false));
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
