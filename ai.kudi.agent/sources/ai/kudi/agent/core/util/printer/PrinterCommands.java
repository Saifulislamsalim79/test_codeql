package ai.kudi.agent.core.util.printer;
/* loaded from: classes.dex */
public final class PrinterCommands {
    public static final byte CEIL = 31;
    public static final byte CONSTANT_NameAndType = 12;
    public static final byte COSH = 24;
    public static final byte DLE = 16;
    public static final byte EOT = 4;
    public static final byte[] ESC_ALIGN_CENTER;
    public static final byte[] ESC_ALIGN_LEFT;
    public static final byte[] ESC_ALIGN_RIGHT;
    public static final byte[] ESC_CANCEL_BOLD;
    public static final byte[] ESC_CANCLE_HORIZONTAL_CENTERS;
    public static final byte[] ESC_ENTER;
    public static final byte[] ESC_FONT_COLOR_DEFAULT;
    public static final byte[] ESC_HORIZONTAL_CENTERS;
    public static byte[] FEED_LINE = null;
    public static byte[] FEED_PAPER_AND_CUT = null;
    public static final byte[] FS_FONT_ALIGN;

    /* renamed from: HT */
    public static final byte f227HT = 9;
    public static final byte[] INIT;
    public static final byte KING = 13;
    public static final byte LINE_FEED = 10;
    public static final byte MODIFIER_SYMBOL = 27;
    public static final byte OTHER_SYMBOL = 28;
    public static final byte[] PRINTE_TEST;
    public static byte[] PRINT_BAR_CODE_1 = null;
    public static byte[] SELECT_BIT_IMAGE_MODE = null;
    public static byte[] SELECT_CYRILLIC_CHARACTER_CODE_TABLE = null;
    public static byte[] SELECT_FONT_A = null;
    public static byte[] SELECT_PRINT_SHEET = null;
    public static byte[] SEND_NULL_BYTE = null;
    public static byte[] SET_BAR_CODE_HEIGHT = null;
    public static byte[] SET_LINE_SPACING_24 = null;
    public static byte[] SET_LINE_SPACING_30 = null;
    public static final byte STX = 2;
    public static final byte SUP = 29;
    public static byte[] TRANSMIT_DLE_ERROR_STATUS;
    public static byte[] TRANSMIT_DLE_OFFLINE_PRINTER_STATUS;
    public static byte[] TRANSMIT_DLE_PRINTER_STATUS;
    public static byte[] TRANSMIT_DLE_ROLL_PAPER_SENSOR_STATUS;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        byte[] $r0 = {MODIFIER_SYMBOL, 64};
        INIT = $r0;
        byte[] $r02 = {MODIFIER_SYMBOL, 114, 0};
        ESC_FONT_COLOR_DEFAULT = $r02;
        byte[] $r03 = {OTHER_SYMBOL, 33, 1, MODIFIER_SYMBOL, 33, 1};
        FS_FONT_ALIGN = $r03;
        byte[] $r04 = {MODIFIER_SYMBOL, 97, 0};
        ESC_ALIGN_LEFT = $r04;
        byte[] $r05 = {MODIFIER_SYMBOL, 97, 2};
        ESC_ALIGN_RIGHT = $r05;
        byte[] $r06 = {MODIFIER_SYMBOL, 97, 1};
        ESC_ALIGN_CENTER = $r06;
        byte[] $r07 = {MODIFIER_SYMBOL, 69, 0};
        ESC_CANCEL_BOLD = $r07;
        byte[] $r08 = {MODIFIER_SYMBOL, 68, 20, OTHER_SYMBOL, 0};
        ESC_HORIZONTAL_CENTERS = $r08;
        byte[] $r09 = {MODIFIER_SYMBOL, 68, 0};
        ESC_CANCLE_HORIZONTAL_CENTERS = $r09;
        byte[] $r010 = {MODIFIER_SYMBOL, 74, 64};
        ESC_ENTER = $r010;
        byte[] $r011 = {SUP, 40, 65};
        PRINTE_TEST = $r011;
        byte[] $r012 = {10};
        FEED_LINE = $r012;
        byte[] $r013 = {20, 33, 0};
        SELECT_FONT_A = $r013;
        byte[] $r014 = {SUP, 104, 100};
        SET_BAR_CODE_HEIGHT = $r014;
        byte[] $r015 = {SUP, 107, 2};
        PRINT_BAR_CODE_1 = $r015;
        byte[] $r016 = {0};
        SEND_NULL_BYTE = $r016;
        byte[] $r017 = {MODIFIER_SYMBOL, 99, 48, 2};
        SELECT_PRINT_SHEET = $r017;
        byte[] $r018 = {SUP, 86, 66, 0};
        FEED_PAPER_AND_CUT = $r018;
        byte[] $r019 = {MODIFIER_SYMBOL, 116, 17};
        SELECT_CYRILLIC_CHARACTER_CODE_TABLE = $r019;
        byte[] $r020 = {MODIFIER_SYMBOL, 42, 33, Byte.MIN_VALUE, 0};
        SELECT_BIT_IMAGE_MODE = $r020;
        byte[] $r021 = {MODIFIER_SYMBOL, 51, COSH};
        SET_LINE_SPACING_24 = $r021;
        byte[] $r022 = {MODIFIER_SYMBOL, 51, 30};
        SET_LINE_SPACING_30 = $r022;
        byte[] $r023 = {DLE, 4, 1};
        TRANSMIT_DLE_PRINTER_STATUS = $r023;
        byte[] $r024 = {DLE, 4, 2};
        TRANSMIT_DLE_OFFLINE_PRINTER_STATUS = $r024;
        byte[] $r025 = {DLE, 4, 3};
        TRANSMIT_DLE_ERROR_STATUS = $r025;
        byte[] $r026 = {DLE, 4, 4};
        TRANSMIT_DLE_ROLL_PAPER_SENSOR_STATUS = $r026;
    }

    private PrinterCommands() {
    }
}
