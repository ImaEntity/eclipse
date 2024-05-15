package com.entity.eclipse.modules.misc;

import com.entity.eclipse.Eclipse;
import com.entity.eclipse.modules.Module;
import com.entity.eclipse.modules.ModuleType;
import com.entity.eclipse.utils.events.Events;
import com.entity.eclipse.utils.events.packet.PacketEvents;
import com.entity.eclipse.utils.events.render.RenderEvent;
import com.entity.eclipse.utils.types.DynamicValue;
import net.minecraft.util.math.Vec3d;

import java.util.HashMap;

public class Test extends Module {
    private HashMap<String, DynamicValue<?>> data = new HashMap<>();

    public Test() {
        super("Test", "idfk", ModuleType.MISC);

        Events.Packet.register(PacketEvents.SEND, event -> {
            if(!this.isEnabled()) return;
        });

        Events.Packet.register(PacketEvents.RECEIVE, event -> {
            if(!this.isEnabled()) return;
        });
    }

    @Override
    public void tick(   ) {
        if(Eclipse.client.player == null) return;

        if(Eclipse.client.player.isOnGround()) return;
        if(Eclipse.client.player.isTouchingWater()) return;
        if(Eclipse.client.player.isInLava()) return;
        if(Eclipse.client.player.isClimbing()) return;
        if(Eclipse.client.player.getVelocity().horizontalLength() < 0.1) return;

        Vec3d lookDir = Vec3d.fromPolar(0, Eclipse.client.player.getYaw());
        double speed = 2;

        Eclipse.client.player.setVelocity(
                lookDir.getX() * speed,
                Eclipse.client.player.getVelocity().getY(),
                lookDir.getZ() * speed
        );
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
