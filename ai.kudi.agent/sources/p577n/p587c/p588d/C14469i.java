package p577n.p587c.p588d;

import java.io.PrintStream;
/* compiled from: Util.java */
/* renamed from: n.c.d.i */
/* loaded from: classes3.dex */
public class C14469i {
    /* renamed from: a */
    public static final void m1648a(String str) {
        PrintStream printStream = System.err;
        printStream.println("SLF4J: " + str);
    }

    /* renamed from: b */
    public static final void m1647b(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }
}
