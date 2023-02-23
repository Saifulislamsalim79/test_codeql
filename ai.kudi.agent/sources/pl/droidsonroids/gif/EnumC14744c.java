package pl.droidsonroids.gif;

import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.wallettopup.WalletTopUpActivity;
import java.util.Locale;
/* compiled from: GifError.java */
/* renamed from: pl.droidsonroids.gif.c */
/* loaded from: classes3.dex */
public enum EnumC14744c {
    NO_ERROR(0, "No error"),
    OPEN_FAILED(101, "Failed to open given input"),
    READ_FAILED(102, "Failed to read from given input"),
    NOT_GIF_FILE(103, "Data is not in GIF format"),
    NO_SCRN_DSCR(104, "No screen descriptor detected"),
    NO_IMAG_DSCR(105, "No image descriptor detected"),
    NO_COLOR_MAP(106, "Neither global nor local color map found"),
    WRONG_RECORD(107, "Wrong record type detected"),
    DATA_TOO_BIG(108, "Number of pixels bigger than width * height"),
    NOT_ENOUGH_MEM(109, "Failed to allocate required memory"),
    CLOSE_FAILED(110, "Failed to close given input"),
    NOT_READABLE(111, "Given file was not opened for read"),
    IMAGE_DEFECT(112, "Image is defective, decoding aborted"),
    EOF_TOO_SOON(113, "Image EOF detected before image complete"),
    NO_FRAMES(1000, "No frames found, at least one frame required"),
    INVALID_SCR_DIMS(WalletTopUpActivity.PERMISSION_REQUEST_CODE, "Invalid screen size, dimensions must be positive"),
    INVALID_IMG_DIMS(1002, "Invalid image size, dimensions must be positive"),
    IMG_NOT_CONFINED(LoginParams.PERMISSION_REQUEST_CODE, "Image size exceeds screen size"),
    REWIND_FAILED(1004, "Input source rewind failed, animation stopped"),
    INVALID_BYTE_BUFFER(1005, "Invalid and/or indirect byte buffer specified"),
    UNKNOWN(-1, "Unknown error");
    

    /* renamed from: c */
    public final String f33006c;

    /* renamed from: d */
    int f33007d;

    EnumC14744c(int i, String str) {
        this.f33007d = i;
        this.f33006c = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static EnumC14744c m407a(int i) {
        EnumC14744c[] values;
        for (EnumC14744c enumC14744c : values()) {
            if (enumC14744c.f33007d == i) {
                return enumC14744c;
            }
        }
        EnumC14744c enumC14744c2 = UNKNOWN;
        enumC14744c2.f33007d = i;
        return enumC14744c2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public String m406b() {
        return String.format(Locale.ENGLISH, "GifError %d: %s", Integer.valueOf(this.f33007d), this.f33006c);
    }
}
