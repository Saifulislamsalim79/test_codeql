package com.google.android.play.core.internal;

import java.io.PrintStream;
/* renamed from: com.google.android.play.core.internal.x */
/* loaded from: classes2.dex */
public final class C5004x {

    /* renamed from: a */
    static final AbstractC4995r f12654a;

    static {
        AbstractC4995r c5002v;
        Integer num = null;
        try {
            try {
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e) {
                System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e.printStackTrace(System.err);
            }
            c5002v = (num == null || num.intValue() < 19) ? !Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ? new C5001u() : new C5002v() : new C5003w();
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            String name = C5002v.class.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 133);
            sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb.append(name);
            sb.append("will be used. The error is: ");
            printStream.println(sb.toString());
            th.printStackTrace(System.err);
            c5002v = new C5002v();
        }
        f12654a = c5002v;
        if (num == null) {
            return;
        }
        num.intValue();
    }

    /* renamed from: a */
    public static void m25877a(Throwable th, Throwable th2) {
        f12654a.mo25878a(th, th2);
    }
}
