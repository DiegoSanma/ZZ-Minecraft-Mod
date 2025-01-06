package net.diego.ziggyzaggamod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.diego.ziggyzaggamod.ZiggyZaggaMod;
import net.diego.ziggyzaggamod.entity.custom.SausageDogEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SausageDogRenderer extends MobRenderer<SausageDogEntity, SausageDogModel<SausageDogEntity>> {

    public SausageDogRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new SausageDogModel<>(pContext.bakeLayer(ModModelLayers.SAUSAGE_DOG_LAYER)), 1.0f);
    }

    @Override
    public ResourceLocation getTextureLocation(SausageDogEntity sausageDogEntity) {
        return new ResourceLocation(ZiggyZaggaMod.MOD_ID,"textures/entity/sausage_dog.png");
    }

    @Override
    public void render(SausageDogEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
