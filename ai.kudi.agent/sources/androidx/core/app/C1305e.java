package androidx.core.app;

import androidx.fragment.app.Fragment;
import java.io.PrintWriter;
import java.io.StringWriter;
/* compiled from: BackstackAccessor.java */
/* renamed from: androidx.core.app.e */
/* loaded from: classes2.dex */
public class C1305e {
    /* renamed from: a */
    public static boolean m36444a(Fragment fragment) {
        try {
            return fragment.isInBackStack();
        } catch (IllegalAccessError unused) {
            return m36443b(fragment);
        }
    }

    /* renamed from: b */
    private static boolean m36443b(Fragment fragment) {
        StringWriter stringWriter = new StringWriter();
        fragment.dump("", null, new PrintWriter(stringWriter), null);
        return !stringWriter.toString().contains("mBackStackNesting=0");
    }
}
