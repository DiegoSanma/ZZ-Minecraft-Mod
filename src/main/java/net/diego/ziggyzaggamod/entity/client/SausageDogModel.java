package net.diego.ziggyzaggamod.entity.client;// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class SausageDogModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	private final ModelPart sausage_Dog;
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart upperBody;
	private final ModelPart leg2;
	private final ModelPart leg0;
	private final ModelPart tail;
	private final ModelPart leg3;
	private final ModelPart leg1;

	public SausageDogModel(ModelPart root) {
		this.sausage_Dog = root.getChild("sausage_Dog");
		this.head = this.sausage_Dog.getChild("head");
		this.body = this.sausage_Dog.getChild("body");
		this.upperBody = this.sausage_Dog.getChild("upperBody");
		this.leg2 = this.sausage_Dog.getChild("leg2");
		this.leg0 = this.sausage_Dog.getChild("leg0");
		this.tail = this.sausage_Dog.getChild("tail");
		this.leg3 = this.sausage_Dog.getChild("leg3");
		this.leg1 = this.sausage_Dog.getChild("leg1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition sausage_Dog = partdefinition.addOrReplaceChild("sausage_Dog", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = sausage_Dog.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.0969F, -1.6F, 6.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(16, 14).addBox(-3.0F, -4.0969F, 0.4F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 14).addBox(1.0F, -4.0969F, 0.4F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(2, 12).addBox(-1.5F, 0.8875F, -3.6F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -7.4031F, -16.4F));

		PartDefinition body = sausage_Dog.addOrReplaceChild("body", CubeListBuilder.create().texOffs(42, 6).addBox(-4.0F, -14.0F, -8.0F, 6.0F, 21.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition upperBody = sausage_Dog.addOrReplaceChild("upperBody", CubeListBuilder.create().texOffs(15, 25).addBox(-4.0F, -1.0F, -2.5F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -5.5F, -13.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition leg2 = sausage_Dog.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 5.0F, -4.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, -8.0F, -4.0F));

		PartDefinition leg0 = sausage_Dog.addOrReplaceChild("leg0", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 5.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, -8.0F, 7.0F));

		PartDefinition tail = sausage_Dog.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(28, 0).addBox(-1.0F, -0.5F, -4.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(28, 7).addBox(-1.0F, -1.5F, 1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.2268F, -5.504F, 13.0F));

		PartDefinition leg3 = sausage_Dog.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 5.0F, -4.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -8.0F, -4.0F));

		PartDefinition leg1 = sausage_Dog.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 5.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -8.0F, 7.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		this.sausage_Dog.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return sausage_Dog;
	}
}