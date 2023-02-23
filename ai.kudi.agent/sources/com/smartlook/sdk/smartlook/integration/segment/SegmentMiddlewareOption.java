package com.smartlook.sdk.smartlook.integration.segment;

import ai.kudi.agent.core.util.printer.PrinterCommands;
import kotlin.Metadata;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum ENABLE_DEFAULT uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
@Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m10421d2 = {"Lcom/smartlook/sdk/smartlook/integration/segment/SegmentMiddlewareOption;", "Ljava/lang/Enum;", "", "code", "B", "getCode", "()B", "<init>", "(Ljava/lang/String;IB)V", "ENABLE_ALIAS", "ENABLE_CUSTOM_EVENTS", "ENABLE_SCREEN_EVENTS", "ENABLE_IDENTIFY", "ENABLE_RESET", "ENABLE_ALL", "ENABLE_DEFAULT", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
/* loaded from: classes2.dex */
public final class SegmentMiddlewareOption {
    private static final /* synthetic */ SegmentMiddlewareOption[] $VALUES;
    public static final SegmentMiddlewareOption ENABLE_ALIAS;
    public static final SegmentMiddlewareOption ENABLE_ALL;
    public static final SegmentMiddlewareOption ENABLE_CUSTOM_EVENTS;
    public static final SegmentMiddlewareOption ENABLE_DEFAULT;
    public static final SegmentMiddlewareOption ENABLE_IDENTIFY;
    public static final SegmentMiddlewareOption ENABLE_RESET;
    public static final SegmentMiddlewareOption ENABLE_SCREEN_EVENTS;
    private final byte code;

    static {
        SegmentMiddlewareOption segmentMiddlewareOption = new SegmentMiddlewareOption("ENABLE_ALIAS", 0, PrinterCommands.DLE);
        ENABLE_ALIAS = segmentMiddlewareOption;
        SegmentMiddlewareOption segmentMiddlewareOption2 = new SegmentMiddlewareOption("ENABLE_CUSTOM_EVENTS", 1, (byte) 8);
        ENABLE_CUSTOM_EVENTS = segmentMiddlewareOption2;
        SegmentMiddlewareOption segmentMiddlewareOption3 = new SegmentMiddlewareOption("ENABLE_SCREEN_EVENTS", 2, (byte) 4);
        ENABLE_SCREEN_EVENTS = segmentMiddlewareOption3;
        SegmentMiddlewareOption segmentMiddlewareOption4 = new SegmentMiddlewareOption("ENABLE_IDENTIFY", 3, (byte) 2);
        ENABLE_IDENTIFY = segmentMiddlewareOption4;
        SegmentMiddlewareOption segmentMiddlewareOption5 = new SegmentMiddlewareOption("ENABLE_RESET", 4, (byte) 1);
        ENABLE_RESET = segmentMiddlewareOption5;
        SegmentMiddlewareOption segmentMiddlewareOption6 = new SegmentMiddlewareOption("ENABLE_ALL", 5, PrinterCommands.CEIL);
        ENABLE_ALL = segmentMiddlewareOption6;
        SegmentMiddlewareOption segmentMiddlewareOption7 = new SegmentMiddlewareOption("ENABLE_DEFAULT", 6, (byte) (((byte) (segmentMiddlewareOption2.code | segmentMiddlewareOption4.code)) | segmentMiddlewareOption5.code));
        ENABLE_DEFAULT = segmentMiddlewareOption7;
        $VALUES = new SegmentMiddlewareOption[]{segmentMiddlewareOption, segmentMiddlewareOption2, segmentMiddlewareOption3, segmentMiddlewareOption4, segmentMiddlewareOption5, segmentMiddlewareOption6, segmentMiddlewareOption7};
    }

    private SegmentMiddlewareOption(String str, int i, byte b) {
        this.code = b;
    }

    public static SegmentMiddlewareOption valueOf(String str) {
        return (SegmentMiddlewareOption) Enum.valueOf(SegmentMiddlewareOption.class, str);
    }

    public static SegmentMiddlewareOption[] values() {
        return (SegmentMiddlewareOption[]) $VALUES.clone();
    }

    public final byte getCode() {
        return this.code;
    }
}
