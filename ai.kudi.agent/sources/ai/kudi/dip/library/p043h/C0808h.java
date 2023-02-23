package ai.kudi.dip.library.p043h;

import java.util.regex.Pattern;
/* compiled from: EnterEmailAddressBottomSheet.kt */
/* renamed from: ai.kudi.dip.library.h.h */
/* loaded from: classes2.dex */
public final class C0808h {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m37970b(String str) {
        return Pattern.compile("^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$", 2).matcher(str).matches();
    }
}
