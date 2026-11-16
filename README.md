# Space Marine Armor (Forge 1.20.1)

Мод: броня Ультрамаринів Mk X «Тактикус» з 3D-моделлю + матеріал кераміт (Create).

## Що робить
- **Повний сет:** +5 до сили (ATTACK_DAMAGE: шолом 1.0, нагрудник 2.0, поножі 1.25, чоботи 0.75), -15% швидкості (≈ Slowness I),
  **нічне бачення** від шолома (знімається разом із шоломом).
- **Кераміт (keramite_ingot):** Create → Mechanical Mixer над Basin, під яким Blaze Burner («heated»):
  2 залізні злитки + 2 цеглини + 1 вугілля → 2 кераміти. Рецепт: data/spacemarine/recipes/keramite_ingot_mixing.json
- **Крафт броні:** тільки в Create Mechanical Crafter (create:mechanical_crafting): helmet, chestplate, leggings, boots.
  Малюнки рецептів у data/spacemarine/recipes/*.json (K = кераміт, L = лазурит, G = золото, B = синій барвник, R = редстоун).

## Як зібрати .jar
1. Java 17 і Forge MDK 1.20.1-47.3.0 (files.minecraftforge.net). З MDK скопіюй `gradlew`, `gradlew.bat` і папку `gradle/` у цю папку.
2. У папці проєкту: `./gradlew build`
3. Готовий файл: `build/libs/spacemarine-1.0.0.jar` → у `mods/` разом із Create 0.5.1.f (1.20.1) і Forge 47.x.

## Де що міняти
- Бонуси/штрафи: `item/MarineArmorItem.java` (SPEED_PENALTY_PER_PIECE), `SpaceMarineMod.java` (сила на кожну частину).
- Захист, міцність, ремонт: `item/MarineArmorMaterial.java`.
- Модель броні: `client/MarineArmorModel.java` (згенерована з `blockbench/Brother_Sgt_Mikhail_armor.bbmodel`),
  текстура: `assets/spacemarine/textures/models/armor/ultramarine.png` (1024x1024, розкладка 256x256).
