package p272h.p286c.p287a.p300b.p307d.p316i;

import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.e6 */
/* loaded from: classes2.dex */
public enum EnumC8587e6 implements InterfaceC8603g {
    UNKNOWN_EVENT(0),
    ON_DEVICE_FACE_DETECT(1),
    ON_DEVICE_FACE_CREATE(2),
    ON_DEVICE_FACE_CLOSE(3),
    ON_DEVICE_FACE_LOAD(4),
    ON_DEVICE_TEXT_DETECT(11),
    ON_DEVICE_TEXT_CREATE(12),
    ON_DEVICE_TEXT_CLOSE(13),
    ON_DEVICE_BARCODE_DETECT(21),
    ON_DEVICE_BARCODE_CREATE(22),
    ON_DEVICE_BARCODE_CLOSE(23),
    ON_DEVICE_BARCODE_LOAD(24),
    ON_DEVICE_IMAGE_LABEL_DETECT(141),
    ON_DEVICE_IMAGE_LABEL_CREATE(142),
    ON_DEVICE_IMAGE_LABEL_CLOSE(143),
    ON_DEVICE_IMAGE_LABEL_LOAD(IjkMediaMeta.FF_PROFILE_H264_HIGH_444),
    ON_DEVICE_SMART_REPLY_DETECT(151),
    ON_DEVICE_SMART_REPLY_CREATE(152),
    ON_DEVICE_SMART_REPLY_CLOSE(153),
    ON_DEVICE_SMART_REPLY_BLACKLIST_UPDATE(154),
    ON_DEVICE_LANGUAGE_IDENTIFICATION_DETECT(161),
    ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE(162),
    ON_DEVICE_LANGUAGE_IDENTIFICATION_LOAD(164),
    ON_DEVICE_LANGUAGE_IDENTIFICATION_CLOSE(163),
    ON_DEVICE_TRANSLATOR_TRANSLATE(171),
    ON_DEVICE_TRANSLATOR_CREATE(172),
    ON_DEVICE_TRANSLATOR_LOAD(173),
    ON_DEVICE_TRANSLATOR_CLOSE(174),
    ON_DEVICE_TRANSLATOR_DOWNLOAD(175),
    ON_DEVICE_ENTITY_EXTRACTION_ANNOTATE(241),
    ON_DEVICE_ENTITY_EXTRACTION_CREATE(242),
    ON_DEVICE_ENTITY_EXTRACTION_LOAD(243),
    ON_DEVICE_ENTITY_EXTRACTION_CLOSE(IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE),
    ON_DEVICE_ENTITY_EXTRACTION_DOWNLOAD(245),
    ON_DEVICE_OBJECT_CREATE(191),
    ON_DEVICE_OBJECT_LOAD(192),
    ON_DEVICE_OBJECT_INFERENCE(193),
    ON_DEVICE_OBJECT_CLOSE(194),
    ON_DEVICE_DI_CREATE(311),
    ON_DEVICE_DI_LOAD(312),
    ON_DEVICE_DI_DOWNLOAD(313),
    ON_DEVICE_DI_RECOGNIZE(314),
    ON_DEVICE_DI_CLOSE(315),
    ON_DEVICE_POSE_CREATE(321),
    ON_DEVICE_POSE_LOAD(322),
    ON_DEVICE_POSE_INFERENCE(323),
    ON_DEVICE_POSE_CLOSE(324),
    ON_DEVICE_POSE_PRELOAD(325),
    ON_DEVICE_SEGMENTATION_CREATE(331),
    ON_DEVICE_SEGMENTATION_LOAD(332),
    ON_DEVICE_SEGMENTATION_INFERENCE(333),
    ON_DEVICE_SEGMENTATION_CLOSE(334),
    CUSTOM_OBJECT_CREATE(341),
    CUSTOM_OBJECT_LOAD(342),
    CUSTOM_OBJECT_INFERENCE(343),
    CUSTOM_OBJECT_CLOSE(344),
    CUSTOM_IMAGE_LABEL_CREATE(351),
    CUSTOM_IMAGE_LABEL_LOAD(352),
    CUSTOM_IMAGE_LABEL_DETECT(353),
    CUSTOM_IMAGE_LABEL_CLOSE(354),
    CLOUD_FACE_DETECT(31),
    CLOUD_FACE_CREATE(32),
    CLOUD_FACE_CLOSE(33),
    CLOUD_CROP_HINTS_CREATE(41),
    CLOUD_CROP_HINTS_DETECT(42),
    CLOUD_CROP_HINTS_CLOSE(43),
    CLOUD_DOCUMENT_TEXT_CREATE(51),
    CLOUD_DOCUMENT_TEXT_DETECT(52),
    CLOUD_DOCUMENT_TEXT_CLOSE(53),
    CLOUD_IMAGE_PROPERTIES_CREATE(61),
    CLOUD_IMAGE_PROPERTIES_DETECT(62),
    CLOUD_IMAGE_PROPERTIES_CLOSE(63),
    CLOUD_IMAGE_LABEL_CREATE(71),
    CLOUD_IMAGE_LABEL_DETECT(72),
    CLOUD_IMAGE_LABEL_CLOSE(73),
    CLOUD_LANDMARK_CREATE(81),
    CLOUD_LANDMARK_DETECT(82),
    CLOUD_LANDMARK_CLOSE(83),
    CLOUD_LOGO_CREATE(91),
    CLOUD_LOGO_DETECT(92),
    CLOUD_LOGO_CLOSE(93),
    CLOUD_SAFE_SEARCH_CREATE(111),
    CLOUD_SAFE_SEARCH_DETECT(112),
    CLOUD_SAFE_SEARCH_CLOSE(113),
    CLOUD_TEXT_CREATE(121),
    CLOUD_TEXT_DETECT(122),
    CLOUD_TEXT_CLOSE(123),
    CLOUD_WEB_SEARCH_CREATE(131),
    CLOUD_WEB_SEARCH_DETECT(132),
    CLOUD_WEB_SEARCH_CLOSE(133),
    CUSTOM_MODEL_RUN(102),
    CUSTOM_MODEL_CREATE(103),
    CUSTOM_MODEL_CLOSE(104),
    CUSTOM_MODEL_LOAD(105),
    AUTOML_IMAGE_LABELING_RUN(181),
    AUTOML_IMAGE_LABELING_CREATE(182),
    AUTOML_IMAGE_LABELING_CLOSE(183),
    AUTOML_IMAGE_LABELING_LOAD(184),
    MODEL_DOWNLOAD(100),
    MODEL_UPDATE(101),
    REMOTE_MODEL_IS_DOWNLOADED(251),
    REMOTE_MODEL_DELETE_ON_DEVICE(252),
    ACCELERATION_ANALYTICS(260),
    PIPELINE_ACCELERATION_ANALYTICS(261),
    AGGREGATED_AUTO_ML_IMAGE_LABELING_INFERENCE(200),
    AGGREGATED_CUSTOM_MODEL_INFERENCE(201),
    AGGREGATED_ON_DEVICE_BARCODE_DETECTION(202),
    AGGREGATED_ON_DEVICE_FACE_DETECTION(203),
    AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION(204),
    AGGREGATED_ON_DEVICE_OBJECT_INFERENCE(205),
    AGGREGATED_ON_DEVICE_TEXT_DETECTION(206),
    AGGREGATED_ON_DEVICE_POSE_DETECTION(207),
    AGGREGATED_ON_DEVICE_SEGMENTATION(208),
    AGGREGATED_CUSTOM_OBJECT_INFERENCE(209),
    AGGREGATED_CUSTOM_IMAGE_LABEL_DETECTION(210),
    REMOTE_CONFIG_FETCH(271),
    REMOTE_CONFIG_ACTIVATE(272),
    REMOTE_CONFIG_LOAD(273),
    REMOTE_CONFIG_FRC_FETCH(281),
    INSTALLATION_ID_INIT(291),
    INSTALLATION_ID_REGISTER_NEW_ID(292),
    INSTALLATION_ID_REFRESH_TEMPORARY_TOKEN(293),
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(301),
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(302),
    INPUT_IMAGE_CONSTRUCTION(361),
    HANDLE_LEAKED(371),
    CAMERA_SOURCE(381),
    OPTIONAL_MODULE_IMAGE_LABELING(391),
    OPTIONAL_MODULE_LANGUAGE_ID(401),
    OPTIONAL_MODULE_LANGUAGE_ID_CREATE(402),
    OPTIONAL_MODULE_LANGUAGE_ID_INIT(403),
    OPTIONAL_MODULE_LANGUAGE_ID_INFERENCE(404),
    OPTIONAL_MODULE_LANGUAGE_ID_RELEASE(405),
    OPTIONAL_MODULE_NLCLASSIFIER(411),
    OPTIONAL_MODULE_NLCLASSIFIER_CREATE(412),
    OPTIONAL_MODULE_NLCLASSIFIER_INIT(413),
    OPTIONAL_MODULE_NLCLASSIFIER_INFERENCE(414),
    OPTIONAL_MODULE_NLCLASSIFIER_RELEASE(415),
    NLCLASSIFIER_CLIENT_LIBRARY(421),
    NLCLASSIFIER_CLIENT_LIBRARY_CREATE(422),
    NLCLASSIFIER_CLIENT_LIBRARY_CLASSIFY(423),
    NLCLASSIFIER_CLIENT_LIBRARY_CLOSE(424),
    OPTIONAL_MODULE_FACE_DETECTION(441),
    OPTIONAL_MODULE_FACE_DETECTION_CREATE(461),
    OPTIONAL_MODULE_FACE_DETECTION_INIT(462),
    OPTIONAL_MODULE_FACE_DETECTION_INFERENCE(463),
    OPTIONAL_MODULE_FACE_DETECTION_RELEASE(464),
    ACCELERATION_ALLOWLIST_GET(431),
    ACCELERATION_ALLOWLIST_FETCH(432),
    ODML_IMAGE(442),
    OPTIONAL_MODULE_BARCODE_DETECTION(443),
    OPTIONAL_MODULE_BARCODE_DETECTION_CREATE(471),
    OPTIONAL_MODULE_BARCODE_DETECTION_INIT(472),
    OPTIONAL_MODULE_BARCODE_DETECTION_INFERENCE(473),
    OPTIONAL_MODULE_BARCODE_DETECTION_RELEASE(474),
    TOXICITY_DETECTION_CREATE_EVENT(451),
    TOXICITY_DETECTION_LOAD_EVENT(452),
    TOXICITY_DETECTION_INFERENCE_EVENT(453),
    TOXICITY_DETECTION_DOWNLOAD_EVENT(454),
    OPTIONAL_MODULE_CUSTOM_IMAGE_LABELING_CREATE(481),
    OPTIONAL_MODULE_CUSTOM_IMAGE_LABELING_INIT(482),
    OPTIONAL_MODULE_CUSTOM_IMAGE_LABELING_INFERENCE(483),
    OPTIONAL_MODULE_CUSTOM_IMAGE_LABELING_RELEASE(484),
    CODE_SCANNER_SCAN_API(491),
    CODE_SCANNER_OPTIONAL_MODULE(492);
    

    /* renamed from: c */
    private final int f20453c;

    EnumC8587e6(int i) {
        this.f20453c = i;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p316i.InterfaceC8603g
    public final int zza() {
        return this.f20453c;
    }
}
