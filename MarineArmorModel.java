package com.spacemarine.client;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;

/** Generated from the Blockbench model (Brother_Sgt_Mikhail_armor.bbmodel). */
public class MarineArmorModel extends HumanoidModel<LivingEntity> {
    public static final ModelLayerLocation LAYER =
            new ModelLayerLocation(new ResourceLocation("spacemarine", "marine_armor"), "main");

    public MarineArmorModel(ModelPart root, EquipmentSlot slot) {
        super(root);
        this.head.visible = slot == EquipmentSlot.HEAD;
        this.hat.visible = false;
        this.body.visible = slot == EquipmentSlot.CHEST;
        this.rightArm.visible = slot == EquipmentSlot.CHEST;
        this.leftArm.visible = slot == EquipmentSlot.CHEST;
        boolean legs = slot == EquipmentSlot.LEGS;
        boolean feet = slot == EquipmentSlot.FEET;
        this.rightLeg.visible = legs || feet;
        this.leftLeg.visible = legs || feet;
        this.rightLeg.getChild("leg_armor").visible = legs;
        this.leftLeg.getChild("leg_armor").visible = legs;
        this.rightLeg.getChild("boots").visible = feet;
        this.leftLeg.getChild("boots").visible = feet;
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = HumanoidModel.createMesh(CubeDeformation.NONE, 0.0F);
        PartDefinition root = mesh.getRoot();
        root.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create()
            .texOffs(51, 54).addBox(-3.485F, -6.996F, -3.28F, 6.97F, 1.64F, 6.56F)
            .texOffs(123, 54).addBox(-3.28F, -6.791F, -3.485F, 6.56F, 0.82F, 6.56F)
            .texOffs(90, 0).addBox(-3.772F, -6.381F, -3.485F, 7.544F, 6.97F, 6.56F)
            .texOffs(119, 0).addBox(-3.28F, -6.791F, -3.075F, 6.56F, 7.38F, 6.56F)
            .texOffs(146, 0).addBox(-3.772F, -6.791F, -3.28F, 7.544F, 7.38F, 6.56F)
            .texOffs(122, 71).addBox(-3.28F, -1.666F, -3.772F, 1.64F, 1.845F, 1.64F)
            .texOffs(17, 76).addBox(-4.1F, -1.42F, -3.69F, 8.2F, 1.353F, 1.64F)
            .texOffs(94, 32).addBox(-4.264F, -5.52F, -2.05F, 8.528F, 6.068F, 4.1F)
            .texOffs(59, 63).addBox(-4.469F, -5.11F, -1.64F, 8.938F, 3.403F, 3.28F)
            .texOffs(129, 71).addBox(-4.551F, -4.29F, -0.82F, 9.102F, 1.763F, 1.64F)
            .texOffs(151, 71).addBox(1.64F, -1.666F, -3.772F, 1.64F, 1.845F, 1.64F)
            .texOffs(196, 63).addBox(-1.558F, -7.8365F, -2.46F, 3.116F, 0.4305F, 4.92F)
            .texOffs(213, 63).addBox(-1.558F, -7.4265F, -2.255F, 3.116F, 0.6355F, 4.715F)
            .texOffs(181, 76).addBox(-1.558F, -7.8365F, 2.46F, 3.116F, 1.2505F, 0F)
            .texOffs(229, 63).addBox(-3.567F, -4.5982F, -3.8008F, 0.492F, 5.1865F, 0.3075F)
            .texOffs(231, 63).addBox(3.075F, -4.5982F, -3.8008F, 0.287F, 5.1865F, 0.3075F),
            PartPose.ZERO);
        head.addOrReplaceChild("rot_head_helm_6", CubeListBuilder.create().texOffs(180, 76).addBox(-0.0308F, -0.2973F, -0.205F, 0.0615F, 0.5945F, 0.41F), PartPose.offsetAndRotation(3.1825F, -2.8513F, -3.485F, 0F, 0F, -0.3927F));
        head.addOrReplaceChild("rot_head_helm_7", CubeListBuilder.create().texOffs(47, 71).addBox(-1.0251F, -1.64F, -0.82F, 2.0501F, 3.28F, 1.64F), PartPose.offsetAndRotation(-2.1286F, -1.092F, -2.8287F, 0F, 0.0873F, 0F));
        head.addOrReplaceChild("rot_head_helm_8", CubeListBuilder.create().texOffs(55, 71).addBox(-1.025F, -1.64F, -0.82F, 2.05F, 3.28F, 1.64F), PartPose.offsetAndRotation(2.1287F, -1.092F, -2.8287F, 0F, -0.0873F, 0F));
        head.addOrReplaceChild("rot_head_helm_15", CubeListBuilder.create().texOffs(84, 63).addBox(-0.205F, -0.82F, -2.46F, 0.41F, 1.64F, 4.92F), PartPose.offsetAndRotation(1.6785F, -7.0014F, 0F, 0F, 0F, -0.3927F));
        head.addOrReplaceChild("rot_head_helm_16", CubeListBuilder.create().texOffs(95, 63).addBox(-0.205F, -0.82F, -2.46F, 0.41F, 1.64F, 4.92F), PartPose.offsetAndRotation(-1.6785F, -7.0014F, 0F, 0F, 0F, 0.3927F));
        head.addOrReplaceChild("rot_head_helm_20", CubeListBuilder.create().texOffs(37, 76).addBox(-0.205F, -1.23F, 0F, 0.41F, 2.46F, 0F), PartPose.offsetAndRotation(-1.8355F, -6.6227F, 2.46F, 0F, 0F, 0.3927F));
        head.addOrReplaceChild("rot_head_helm_21", CubeListBuilder.create().texOffs(38, 76).addBox(-0.205F, -1.23F, 0F, 0.41F, 2.46F, 0F), PartPose.offsetAndRotation(1.8355F, -6.6227F, 2.46F, 0F, 0F, -0.3927F));
        head.addOrReplaceChild("rot_head_helm_22", CubeListBuilder.create().texOffs(158, 71).addBox(-3.075F, -1.1685F, -0.451F, 6.15F, 2.337F, 0.902F), PartPose.offsetAndRotation(0F, -5.1685F, -3.2718F, -0.1222F, 0F, 0F));
        head.addOrReplaceChild("rot_head_helm_25", CubeListBuilder.create().texOffs(188, 76).addBox(-0.41F, -0.3485F, -0.451F, 0.82F, 0.697F, 0.902F), PartPose.offsetAndRotation(0F, -4.9393F, -3.4238F, -0.1222F, 0F, 0F));
        head.addOrReplaceChild("rot_head_helm_26", CubeListBuilder.create().texOffs(192, 76).addBox(-0.287F, -0.164F, -0.451F, 0.574F, 0.328F, 0.902F), PartPose.offsetAndRotation(0F, -4.4306F, -3.4863F, -0.1222F, 0F, 0F));
        head.addOrReplaceChild("rot_head_helm_27", CubeListBuilder.create().texOffs(195, 76).addBox(-1.025F, -0.615F, -0.246F, 2.05F, 1.23F, 0.492F), PartPose.offsetAndRotation(-2.3823F, -2.5035F, -3.5314F, -0.004F, 0.0017F, 0.3927F));
        head.addOrReplaceChild("rot_head_helm_28", CubeListBuilder.create().texOffs(201, 76).addBox(-0.328F, -0.41F, -0.246F, 0.656F, 0.82F, 0.492F), PartPose.offsetAndRotation(-3.0128F, -3.8742F, -3.5254F, -0.004F, 0.0017F, 0.3927F));
        head.addOrReplaceChild("rot_head_helm_29", CubeListBuilder.create().texOffs(39, 76).addBox(-1.353F, -1.025F, -0.1435F, 2.706F, 2.05F, 0.287F), PartPose.offsetAndRotation(-1.2622F, -3.8143F, -3.4232F, -0.004F, 0.0017F, 0.3927F));
        head.addOrReplaceChild("rot_head_helm_30", CubeListBuilder.create().texOffs(204, 76).addBox(-1.1275F, -0.41F, -0.246F, 2.255F, 0.82F, 0.492F), PartPose.offsetAndRotation(-0.812F, -2.8124F, -3.5301F, -0.004F, -0.0017F, -0.3927F));
        head.addOrReplaceChild("rot_head_helm_31", CubeListBuilder.create().texOffs(210, 76).addBox(-1.1993F, -0.615F, -0.2459F, 2.3985F, 1.23F, 0.4919F), PartPose.offsetAndRotation(1.9783F, -2.3367F, -3.5321F, -0.004F, -0.0017F, -0.3927F));
        head.addOrReplaceChild("rot_head_helm_32", CubeListBuilder.create().texOffs(216, 76).addBox(-0.1537F, -0.287F, -0.246F, 0.3075F, 0.574F, 0.492F), PartPose.offsetAndRotation(3.0838F, -3.1496F, -3.5286F, -0.004F, -0.0017F, -0.3927F));
        head.addOrReplaceChild("rot_head_helm_33", CubeListBuilder.create().texOffs(218, 76).addBox(-0.2563F, -0.369F, -0.246F, 0.5125F, 0.738F, 0.492F), PartPose.offsetAndRotation(2.9718F, -3.9021F, -3.5253F, -0.004F, -0.0017F, -0.3927F));
        head.addOrReplaceChild("rot_head_helm_34", CubeListBuilder.create().texOffs(45, 76).addBox(-1.3427F, -1.107F, -0.1435F, 2.6855F, 2.214F, 0.287F), PartPose.offsetAndRotation(1.3631F, -3.7678F, -3.4234F, -0.004F, -0.0017F, -0.3927F));
        head.addOrReplaceChild("rot_head_helm_35", CubeListBuilder.create().texOffs(21, 79).addBox(-0.2152F, -0.041F, -0.246F, 0.4305F, 0.082F, 0.492F), PartPose.offsetAndRotation(3.0908F, -3.5076F, -3.5271F, -0.004F, -0.0017F, -0.3927F));
        head.addOrReplaceChild("rot_head_helm_36", CubeListBuilder.create().texOffs(221, 76).addBox(-1.1275F, -0.41F, -0.246F, 2.255F, 0.82F, 0.492F), PartPose.offsetAndRotation(0.8151F, -2.8106F, -3.5301F, -0.004F, 0.0017F, 0.3927F));
        head.addOrReplaceChild("rot_head_helm_37", CubeListBuilder.create().texOffs(23, 79).addBox(-0.6355F, -0.205F, 0F, 1.271F, 0.41F, 0F), PartPose.offsetAndRotation(-0.9661F, -1.9876F, -3.8002F, -0.004F, -0.0017F, -0.3927F));
        head.addOrReplaceChild("rot_head_helm_38", CubeListBuilder.create().texOffs(26, 79).addBox(-0.6355F, -0.205F, 0F, 1.271F, 0.41F, 0F), PartPose.offsetAndRotation(0.9693F, -1.9858F, -3.8002F, -0.004F, 0.0017F, 0.3927F));
        head.addOrReplaceChild("rot_head_helm_39", CubeListBuilder.create().texOffs(29, 79).addBox(-0.6355F, -0.205F, 0F, 1.271F, 0.41F, 0F), PartPose.offsetAndRotation(0.9693F, -1.1658F, -3.8037F, -0.004F, 0.0017F, 0.3927F));
        head.addOrReplaceChild("rot_head_helm_40", CubeListBuilder.create().texOffs(32, 79).addBox(-0.6355F, -0.205F, 0F, 1.271F, 0.41F, 0F), PartPose.offsetAndRotation(-0.9661F, -1.1676F, -3.8037F, -0.004F, -0.0017F, -0.3927F));
        head.addOrReplaceChild("rot_head_helm_41", CubeListBuilder.create().texOffs(35, 79).addBox(-0.6355F, -0.205F, 0F, 1.271F, 0.41F, 0F), PartPose.offsetAndRotation(0.9693F, -0.3458F, -3.8073F, -0.004F, 0.0017F, 0.3927F));
        head.addOrReplaceChild("rot_head_helm_42", CubeListBuilder.create().texOffs(38, 79).addBox(-0.6355F, -0.205F, 0F, 1.271F, 0.41F, 0F), PartPose.offsetAndRotation(-0.9661F, -0.3477F, -3.8073F, -0.004F, -0.0017F, -0.3927F));
        head.addOrReplaceChild("rot_head_helm_43", CubeListBuilder.create().texOffs(173, 71).addBox(-1.7425F, -1.7015F, -0.246F, 3.485F, 3.403F, 0.492F), PartPose.offsetAndRotation(0F, -1.0922F, -3.5376F, 0F, 0.0044F, 1.5708F));
        head.addOrReplaceChild("rot_head_helm_44", CubeListBuilder.create().texOffs(227, 76).addBox(-0.8303F, -0.41F, -0.246F, 1.6605F, 0.82F, 0.492F), PartPose.offsetAndRotation(0.6431F, -4.1542F, -3.5242F, -0.0042F, -0.0011F, -0.2618F));
        head.addOrReplaceChild("rot_head_helm_45", CubeListBuilder.create().texOffs(232, 76).addBox(-0.779F, -0.3997F, -0.246F, 1.558F, 0.7995F, 0.492F), PartPose.offsetAndRotation(-0.6657F, -4.1741F, -3.5241F, -0.0042F, 0.0011F, 0.2618F));
        head.addOrReplaceChild("rot_head_helm_46", CubeListBuilder.create().texOffs(41, 79).addBox(-0.205F, -0.123F, -0.246F, 0.41F, 0.246F, 0.492F), PartPose.offsetAndRotation(-0.0131F, -4.3918F, -3.5232F, -0.0042F, 0.0011F, 0.2618F));
        head.addOrReplaceChild("rot_head_helm_47", CubeListBuilder.create().texOffs(43, 79).addBox(-0.82F, -0.1742F, -0.246F, 1.64F, 0.3485F, 0.492F), PartPose.offsetAndRotation(-2.2686F, -4.3702F, -3.5233F, -0.0042F, 0.0011F, 0.2618F));
        head.addOrReplaceChild("rot_head_helm_48", CubeListBuilder.create().texOffs(48, 79).addBox(-0.4817F, -0.0717F, -0.246F, 0.9635F, 0.1435F, 0.492F), PartPose.offsetAndRotation(-1.8782F, -4.5202F, -3.5226F, -0.0042F, 0.0011F, 0.2618F));
        head.addOrReplaceChild("rot_head_helm_49", CubeListBuilder.create().texOffs(51, 79).addBox(-0.8097F, -0.1025F, -0.246F, 1.6195F, 0.205F, 0.492F), PartPose.offsetAndRotation(2.3068F, -4.2816F, -3.5236F, -0.0042F, -0.0011F, -0.2618F));
        head.addOrReplaceChild("rot_head_helm_50", CubeListBuilder.create().texOffs(56, 79).addBox(-0.3792F, -0.205F, -0.246F, 0.7585F, 0.41F, 0.492F), PartPose.offsetAndRotation(1.8114F, -4.4672F, -3.5229F, -0.0042F, -0.0011F, -0.2618F));
        head.addOrReplaceChild("rot_head_helm_51", CubeListBuilder.create().texOffs(59, 79).addBox(-0.205F, -0.164F, -0.246F, 0.41F, 0.328F, 0.492F), PartPose.offsetAndRotation(2.3864F, -4.5788F, -3.5224F, -0.0042F, -0.0011F, -0.2618F));
        PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create()
            .texOffs(186, 32).addBox(-4.92F, 0.384F, -4.51F, 9.84F, 0.82F, 9.02F)
            .texOffs(224, 32).addBox(-4.92F, -0.436F, -4.51F, 0.82F, 0.82F, 9.02F)
            .texOffs(0, 44).addBox(4.1F, -0.436F, -4.51F, 0.82F, 0.82F, 9.02F)
            .texOffs(201, 71).addBox(-4.1F, -1.256F, 3.69F, 8.2F, 1.64F, 0.82F)
            .texOffs(83, 76).addBox(0.82F, -0.436F, -4.51F, 3.28F, 0.82F, 0.41F)
            .texOffs(91, 76).addBox(-4.1F, -0.436F, -4.51F, 3.28F, 0.82F, 0.41F)
            .texOffs(20, 44).addBox(-4.51F, 9.404F, -3.69F, 9.02F, 1.64F, 7.79F)
            .texOffs(0, 20).addBox(-4.715F, 1.204F, -4.305F, 9.43F, 3.28F, 8.61F)
            .texOffs(70, 71).addBox(-0.82F, 1.819F, -4.51F, 1.64F, 1.64F, 1.64F)
            .texOffs(220, 71).addBox(0.82F, 1.819F, -4.428F, 0.41F, 1.312F, 1.558F)
            .texOffs(119, 76).addBox(0.82F, 2.393F, -4.346F, 2.87F, 0.41F, 1.558F)
            .texOffs(128, 76).addBox(-3.69F, 2.393F, -4.346F, 2.87F, 0.41F, 1.558F)
            .texOffs(77, 71).addBox(-1.23F, 8.994F, -4.428F, 2.46F, 2.46F, 0.738F)
            .texOffs(173, 76).addBox(-0.5125F, 9.609F, -4.633F, 1.025F, 0.82F, 0.738F)
            .texOffs(244, 71).addBox(-1.23F, 1.819F, -4.428F, 0.41F, 1.312F, 1.558F)
            .texOffs(54, 44).addBox(-4.715F, 4.484F, -4.305F, 3.69F, 0.82F, 8.61F)
            .texOffs(79, 44).addBox(1.025F, 4.484F, -4.305F, 3.69F, 0.82F, 8.61F)
            .texOffs(177, 76).addBox(-0.3075F, 10.429F, -4.633F, 0.615F, 0.41F, 0.738F)
            .texOffs(248, 71).addBox(-3.075F, 9.199F, -4.305F, 1.64F, 2.05F, 0.615F)
            .texOffs(0, 76).addBox(1.435F, 9.199F, -4.305F, 1.64F, 2.05F, 0.615F)
            .texOffs(45, 63).addBox(-2.46F, -1.256F, 5.945F, 4.92F, 4.92F, 1.64F)
            .texOffs(73, 32).addBox(-3.485F, -2.896F, 4.1F, 6.97F, 6.724F, 3.28F)
            .texOffs(152, 63).addBox(-4.305F, -0.436F, 4.92F, 8.61F, 3.444F, 1.64F)
            .texOffs(27, 71).addBox(2.46F, -1.461F, 4.51F, 1.64F, 0.82F, 3.28F)
            .texOffs(37, 71).addBox(-4.1F, -1.461F, 4.51F, 1.64F, 0.82F, 3.28F)
            .texOffs(173, 63).addBox(-3.895F, -3.716F, 4.51F, 7.79F, 2.255F, 3.28F),
            PartPose.ZERO);
        body.addOrReplaceChild("rot_body_plate_9", CubeListBuilder.create().texOffs(48, 32).addBox(-4.1F, -3.075F, -1.9475F, 8.2F, 6.15F, 3.895F), PartPose.offsetAndRotation(0F, 6.9929F, 1.9083F, -0.0873F, 0F, 0F));
        body.addOrReplaceChild("rot_body_plate_12", CubeListBuilder.create().texOffs(224, 71).addBox(-1.64F, -0.205F, -0.82F, 3.28F, 0.41F, 1.64F), PartPose.offsetAndRotation(-2.4351F, 1.7392F, -3.608F, 0F, 0F, 0.1745F));
        body.addOrReplaceChild("rot_body_plate_13", CubeListBuilder.create().texOffs(234, 71).addBox(-1.64F, -0.205F, -0.82F, 3.28F, 0.41F, 1.64F), PartPose.offsetAndRotation(2.4351F, 1.7392F, -3.608F, 0F, 0F, -0.1745F));
        body.addOrReplaceChild("rot_body_plate_14", CubeListBuilder.create().texOffs(99, 76).addBox(-1.5375F, -0.205F, -0.779F, 3.075F, 0.41F, 1.558F), PartPose.offsetAndRotation(2.3445F, 2.1363F, -3.567F, 0F, 0F, -0.0873F));
        body.addOrReplaceChild("rot_body_plate_15", CubeListBuilder.create().texOffs(109, 76).addBox(-1.5375F, -0.205F, -0.779F, 3.075F, 0.41F, 1.558F), PartPose.offsetAndRotation(-2.3445F, 2.1363F, -3.567F, 0F, 0F, 0.0873F));
        body.addOrReplaceChild("rot_body_plate_18", CubeListBuilder.create().texOffs(137, 76).addBox(-1.3325F, -0.205F, -0.779F, 2.665F, 0.41F, 1.558F), PartPose.offsetAndRotation(1.9912F, 3.1102F, -3.567F, 0F, 0F, 0.0873F));
        body.addOrReplaceChild("rot_body_plate_19", CubeListBuilder.create().texOffs(146, 76).addBox(-1.3325F, -0.205F, -0.779F, 2.665F, 0.41F, 1.558F), PartPose.offsetAndRotation(-2.0729F, 3.1173F, -3.567F, 0F, 0F, -0.0873F));
        body.addOrReplaceChild("rot_body_plate_20", CubeListBuilder.create().texOffs(155, 76).addBox(-1.3325F, -0.205F, -0.779F, 2.665F, 0.41F, 1.558F), PartPose.offsetAndRotation(-1.8235F, 3.5936F, -3.567F, 0F, 0F, -0.1745F));
        body.addOrReplaceChild("rot_body_plate_21", CubeListBuilder.create().texOffs(164, 76).addBox(-1.3325F, -0.205F, -0.779F, 2.665F, 0.41F, 1.558F), PartPose.offsetAndRotation(1.7427F, 3.5795F, -3.567F, 0F, 0F, 0.1745F));
        body.addOrReplaceChild("rot_body_plate_30", CubeListBuilder.create().texOffs(37, 20).addBox(-4.305F, -3.69F, -2.05F, 8.61F, 7.38F, 4.1F), PartPose.offsetAndRotation(0F, 6.9935F, -1.4406F, 0.1309F, 0F, 0F));
        body.addOrReplaceChild("rot_body_plate_31", CubeListBuilder.create().texOffs(5, 76).addBox(-2.665F, -1.23F, -0.1845F, 5.33F, 2.46F, 0.369F), PartPose.offsetAndRotation(0F, 8.1988F, -3.3703F, 0.1309F, 0F, 0F));
        body.addOrReplaceChild("rot_body_plate_32", CubeListBuilder.create().texOffs(84, 71).addBox(-3.075F, -1.763F, -0.1845F, 6.15F, 3.526F, 0.369F), PartPose.offsetAndRotation(0F, 5.6186F, -3.8754F, 0.1309F, 0F, 0F));
        body.addOrReplaceChild("rot_body_plate_33", CubeListBuilder.create().texOffs(208, 44).addBox(-2.255F, -2.255F, -2.05F, 4.51F, 4.51F, 4.1F), PartPose.offsetAndRotation(-6.15F, -2.223F, 6.502F, 0.3927F, 0F, 0F));
        body.addOrReplaceChild("rot_body_plate_34", CubeListBuilder.create().texOffs(226, 44).addBox(-2.05F, -2.46F, -1.845F, 4.1F, 4.92F, 3.69F), PartPose.offsetAndRotation(-6.15F, -1.276F, 6.8942F, 0.3927F, 0F, 0F));
        body.addOrReplaceChild("rot_body_plate_35", CubeListBuilder.create().texOffs(0, 54).addBox(-2.255F, -2.255F, -2.05F, 4.51F, 4.51F, 4.1F), PartPose.offsetAndRotation(6.15F, -2.223F, 6.502F, 0.3927F, 0F, 0F));
        body.addOrReplaceChild("rot_body_plate_36", CubeListBuilder.create().texOffs(18, 54).addBox(-2.05F, -2.46F, -1.845F, 4.1F, 4.92F, 3.69F), PartPose.offsetAndRotation(6.15F, -1.276F, 6.8942F, 0.3927F, 0F, 0F));
        body.addOrReplaceChild("rot_body_plate_37", CubeListBuilder.create().texOffs(34, 54).addBox(-2.46F, -2.46F, -1.64F, 4.92F, 4.92F, 3.28F), PartPose.offsetAndRotation(0F, 3.8047F, 5.74F, 0F, 0F, -0.7854F));
        body.addOrReplaceChild("rot_body_plate_38", CubeListBuilder.create().texOffs(98, 71).addBox(-2.05F, -0.82F, -0.82F, 4.1F, 1.64F, 1.64F), PartPose.offsetAndRotation(-1.4496F, 7.234F, 5.74F, 0F, 0F, -0.7854F));
        body.addOrReplaceChild("rot_body_plate_39", CubeListBuilder.create().texOffs(240, 63).addBox(-1.1685F, -1.025F, -1.025F, 2.337F, 2.05F, 2.05F), PartPose.offsetAndRotation(-2.1309F, 7.9152F, 5.74F, 0F, 0F, -0.7854F));
        body.addOrReplaceChild("rot_body_plate_40", CubeListBuilder.create().texOffs(0, 71).addBox(-1.1685F, -1.025F, -1.025F, 2.337F, 2.05F, 2.05F), PartPose.offsetAndRotation(-3.8703F, 6.1757F, 5.74F, 0F, 0F, -0.7854F));
        body.addOrReplaceChild("rot_body_plate_41", CubeListBuilder.create().texOffs(110, 71).addBox(-2.05F, -0.82F, -0.82F, 4.1F, 1.64F, 1.64F), PartPose.offsetAndRotation(-3.1891F, 5.4944F, 5.74F, 0F, 0F, -0.7854F));
        body.addOrReplaceChild("rot_body_plate_42", CubeListBuilder.create().texOffs(138, 63).addBox(-0.82F, -2.05F, -0.82F, 1.64F, 4.1F, 1.64F), PartPose.offsetAndRotation(1.4496F, 7.234F, 5.74F, 0F, 0F, -0.7854F));
        body.addOrReplaceChild("rot_body_plate_43", CubeListBuilder.create().texOffs(145, 63).addBox(-0.82F, -2.05F, -0.82F, 1.64F, 4.1F, 1.64F), PartPose.offsetAndRotation(3.1891F, 5.4944F, 5.74F, 0F, 0F, -0.7854F));
        body.addOrReplaceChild("rot_body_plate_44", CubeListBuilder.create().texOffs(9, 71).addBox(-1.025F, -1.1685F, -1.025F, 2.05F, 2.337F, 2.05F), PartPose.offsetAndRotation(3.8703F, 6.1757F, 5.74F, 0F, 0F, -0.7854F));
        body.addOrReplaceChild("rot_body_plate_45", CubeListBuilder.create().texOffs(18, 71).addBox(-1.025F, -1.1685F, -1.025F, 2.05F, 2.337F, 2.05F), PartPose.offsetAndRotation(2.1309F, 7.9152F, 5.74F, 0F, 0F, -0.7854F));
        PartDefinition right_arm = root.addOrReplaceChild("right_arm", CubeListBuilder.create()
            .texOffs(63, 20).addBox(-5.39F, 1.664F, -4.92F, 5.33F, 1.64F, 9.84F)
            .texOffs(0, 0).addBox(-0.06F, -6.536F, -4.92F, 1.64F, 9.84F, 9.84F)
            .texOffs(175, 0).addBox(-4.98F, -4.076F, -4.1F, 4.92F, 5.74F, 8.2F)
            .texOffs(94, 20).addBox(-4.16F, -4.896F, -3.28F, 4.1F, 4.92F, 6.56F)
            .texOffs(104, 44).addBox(-3.34F, -5.716F, -2.46F, 3.28F, 4.92F, 4.92F)
            .texOffs(121, 44).addBox(1.58F, -1.616F, -2.46F, 1.64F, 4.1F, 4.92F)
            .texOffs(79, 54).addBox(-3.955F, 2.074F, -2.665F, 5.33F, 3.28F, 5.33F)
            .texOffs(135, 44).addBox(-5.185F, 0.024F, -4.305F, 1.435F, 1.23F, 8.61F)
            .texOffs(156, 44).addBox(-4.16F, -1.206F, -4.305F, 1.435F, 1.23F, 8.61F)
            .texOffs(233, 63).addBox(-5.185F, -3.256F, -1.435F, 0.205F, 2.46F, 2.87F)
            .texOffs(63, 71).addBox(-5.595F, -3.051F, -1.23F, 1.025F, 2.05F, 2.46F)
            .texOffs(237, 76).addBox(-5.185F, -3.871F, -0.41F, 0.205F, 0.615F, 0.82F)
            .texOffs(240, 76).addBox(-5.185F, -3.871F, 0.615F, 0.205F, 0.615F, 0.82F)
            .texOffs(243, 76).addBox(-5.185F, -3.871F, -1.435F, 0.205F, 0.615F, 0.82F)
            .texOffs(246, 76).addBox(-5.185F, -3.133F, -2.05F, 0.205F, 0.615F, 0.615F)
            .texOffs(248, 76).addBox(-5.185F, -2.313F, -2.05F, 0.205F, 0.615F, 0.615F)
            .texOffs(250, 76).addBox(-5.185F, -1.493F, -2.05F, 0.205F, 0.615F, 0.615F)
            .texOffs(252, 76).addBox(-5.185F, -1.493F, 1.435F, 0.205F, 0.615F, 0.615F)
            .texOffs(254, 76).addBox(-5.185F, -2.313F, 1.435F, 0.205F, 0.615F, 0.615F)
            .texOffs(0, 79).addBox(-5.185F, -3.133F, 1.435F, 0.205F, 0.615F, 0.615F)
            .texOffs(2, 79).addBox(-5.185F, -0.796F, -1.435F, 0.205F, 0.615F, 0.82F)
            .texOffs(5, 79).addBox(-5.185F, -0.796F, -0.41F, 0.205F, 0.615F, 0.82F)
            .texOffs(8, 79).addBox(-5.185F, -0.796F, 0.615F, 0.205F, 0.615F, 0.82F)
            .texOffs(150, 54).addBox(-3.75F, 4.124F, -2.46F, 4.92F, 2.46F, 4.92F)
            .texOffs(120, 32).addBox(-3.955F, 6.584F, -2.665F, 5.33F, 4.92F, 5.33F)
            .texOffs(170, 54).addBox(-4.16F, 4.739F, -1.845F, 5.74F, 3.075F, 4.715F),
            PartPose.offset(-5F, 2F, 0F));
        PartDefinition left_arm = root.addOrReplaceChild("left_arm", CubeListBuilder.create()
            .texOffs(23, 0).addBox(-1.58F, -6.536F, -4.92F, 1.64F, 9.84F, 9.84F)
            .texOffs(116, 20).addBox(0.06F, 1.664F, -4.92F, 5.33F, 1.64F, 9.84F)
            .texOffs(202, 0).addBox(0.06F, -4.076F, -4.1F, 4.92F, 5.74F, 8.2F)
            .texOffs(142, 32).addBox(0.06F, -4.896F, -3.28F, 4.1F, 4.1F, 6.56F)
            .texOffs(177, 44).addBox(0.06F, -5.716F, -2.46F, 3.28F, 4.1F, 4.92F)
            .texOffs(51, 76).addBox(3.504F, 0.229F, -1.025F, 1.64F, 0.615F, 2.05F)
            .texOffs(59, 76).addBox(3.504F, -1.001F, -1.64F, 1.64F, 1.64F, 0.615F)
            .texOffs(64, 76).addBox(3.504F, -1.001F, 1.025F, 1.64F, 1.64F, 0.615F)
            .texOffs(11, 79).addBox(3.504F, -1.821F, -1.353F, 1.64F, 0.82F, 0.615F)
            .texOffs(69, 76).addBox(3.504F, -2.436F, -1.968F, 1.64F, 0.615F, 1.435F)
            .texOffs(76, 76).addBox(3.504F, -2.436F, 0.533F, 1.64F, 0.615F, 1.435F)
            .texOffs(16, 79).addBox(3.504F, -1.821F, 0.738F, 1.64F, 0.82F, 0.615F)
            .texOffs(194, 44).addBox(-3.22F, -1.616F, -2.46F, 1.64F, 4.1F, 4.92F)
            .texOffs(101, 54).addBox(-1.375F, 2.074F, -2.665F, 5.33F, 3.28F, 5.33F)
            .texOffs(191, 54).addBox(-1.17F, 4.124F, -2.46F, 4.92F, 2.46F, 4.92F)
            .texOffs(164, 32).addBox(-1.375F, 6.584F, -2.665F, 5.33F, 4.92F, 5.33F)
            .texOffs(211, 54).addBox(-1.58F, 4.739F, -1.845F, 5.74F, 3.075F, 4.715F),
            PartPose.offset(5F, 2F, 0F));
        PartDefinition right_leg = root.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12F, 0F));
        PartDefinition right_leg_leg_armor = right_leg.addOrReplaceChild("leg_armor", CubeListBuilder.create()
            .texOffs(147, 20).addBox(-3.143F, -1.366F, -3.28F, 4.92F, 5.33F, 6.56F)
            .texOffs(232, 54).addBox(-3.143F, 4.989F, -3.28F, 0.82F, 0.82F, 6.56F)
            .texOffs(0, 63).addBox(0.957F, 4.989F, -3.28F, 0.82F, 0.82F, 6.56F)
            .texOffs(106, 63).addBox(-2.651F, 3.144F, -3.69F, 4.1F, 3.485F, 3.485F)
            .texOffs(46, 0).addBox(-2.979F, 3.144F, -3.075F, 4.51F, 8.2F, 6.15F),
            PartPose.ZERO);
        PartDefinition right_leg_boots = right_leg.addOrReplaceChild("boots", CubeListBuilder.create()
            .texOffs(170, 20).addBox(-3.143F, 5.809F, -3.28F, 4.92F, 4.51F, 6.56F)
            .texOffs(193, 20).addBox(-3.348F, 7.859F, -3.485F, 5.33F, 4.1F, 6.97F)
            .texOffs(181, 71).addBox(-2.528F, 9.499F, -4.715F, 3.69F, 2.46F, 1.23F),
            PartPose.ZERO);
        PartDefinition left_leg = root.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(1.9F, 12F, 0F));
        PartDefinition left_leg_leg_armor = left_leg.addOrReplaceChild("leg_armor", CubeListBuilder.create()
            .texOffs(218, 20).addBox(-1.777F, -1.366F, -3.28F, 4.92F, 5.33F, 6.56F)
            .texOffs(68, 0).addBox(-1.572F, 3.144F, -3.075F, 4.51F, 8.2F, 6.15F)
            .texOffs(15, 63).addBox(-1.777F, 4.989F, -3.28F, 0.82F, 0.82F, 6.56F)
            .texOffs(30, 63).addBox(2.323F, 4.989F, -3.28F, 0.82F, 0.82F, 6.56F)
            .texOffs(122, 63).addBox(-1.367F, 3.144F, -3.69F, 4.1F, 3.485F, 3.485F),
            PartPose.ZERO);
        PartDefinition left_leg_boots = left_leg.addOrReplaceChild("boots", CubeListBuilder.create()
            .texOffs(0, 32).addBox(-1.777F, 5.809F, -3.28F, 4.92F, 4.51F, 6.56F)
            .texOffs(23, 32).addBox(-1.982F, 7.859F, -3.485F, 5.33F, 4.1F, 6.97F)
            .texOffs(191, 71).addBox(-1.162F, 9.499F, -4.715F, 3.69F, 2.46F, 1.23F),
            PartPose.ZERO);
        return LayerDefinition.create(mesh, 256, 256);
    }
}
