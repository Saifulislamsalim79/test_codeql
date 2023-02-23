package kotlin.p492io;

import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.C13666w;
import kotlin.C13668y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p548k0.InterfaceC13230h;
import kotlin.p557z.AbstractC13687c;
/* compiled from: FileTreeWalk.kt */
/* renamed from: kotlin.io.e */
/* loaded from: classes3.dex */
public final class C11846e implements InterfaceC13230h<File> {

    /* renamed from: a */
    private final File f26523a;

    /* renamed from: b */
    private final EnumC11854g f26524b;

    /* renamed from: c */
    private final InterfaceC11767l<File, Boolean> f26525c;

    /* renamed from: d */
    private final InterfaceC11767l<File, C13666w> f26526d;

    /* renamed from: e */
    private final InterfaceC11771p<File, IOException, C13666w> f26527e;

    /* renamed from: f */
    private final int f26528f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FileTreeWalk.kt */
    /* renamed from: kotlin.io.e$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC11847a extends AbstractC11852c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC11847a(File file) {
            super(file);
            l.f(file, "rootDir");
            if (C13668y.f30115a) {
                boolean isDirectory = file.isDirectory();
                if (C13668y.f30115a && !isDirectory) {
                    throw new AssertionError("rootDir must be verified to be directory beforehand.");
                }
            }
        }
    }

    /* compiled from: FileTreeWalk.kt */
    /* renamed from: kotlin.io.e$b */
    /* loaded from: classes3.dex */
    private final class C11848b extends AbstractC13687c<File> {

        /* renamed from: e */
        private final ArrayDeque<AbstractC11852c> f26529e = new ArrayDeque<>();

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: FileTreeWalk.kt */
        /* renamed from: kotlin.io.e$b$a */
        /* loaded from: classes3.dex */
        public final class C11849a extends AbstractC11847a {

            /* renamed from: b */
            private boolean f26531b;

            /* renamed from: c */
            private File[] f26532c;

            /* renamed from: d */
            private int f26533d;

            /* renamed from: e */
            private boolean f26534e;

            /* renamed from: f */
            final /* synthetic */ C11848b f26535f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11849a(C11848b c11848b, File file) {
                super(file);
                l.f(file, "rootDir");
                this.f26535f = c11848b;
            }

            @Override // kotlin.p492io.C11846e.AbstractC11852c
            /* renamed from: b */
            public File mo10246b() {
                if (!this.f26534e && this.f26532c == null) {
                    InterfaceC11767l interfaceC11767l = C11846e.this.f26525c;
                    if (interfaceC11767l != null && !((Boolean) interfaceC11767l.invoke(m10247a())).booleanValue()) {
                        return null;
                    }
                    File[] listFiles = m10247a().listFiles();
                    this.f26532c = listFiles;
                    if (listFiles == null) {
                        InterfaceC11771p interfaceC11771p = C11846e.this.f26527e;
                        if (interfaceC11771p != null) {
                            C13666w c13666w = (C13666w) interfaceC11771p.invoke(m10247a(), new AccessDeniedException(m10247a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f26534e = true;
                    }
                }
                File[] fileArr = this.f26532c;
                if (fileArr != null) {
                    int i = this.f26533d;
                    l.d(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.f26532c;
                        l.d(fileArr2);
                        int i2 = this.f26533d;
                        this.f26533d = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (this.f26531b) {
                    InterfaceC11767l interfaceC11767l2 = C11846e.this.f26526d;
                    if (interfaceC11767l2 != null) {
                        C13666w c13666w2 = (C13666w) interfaceC11767l2.invoke(m10247a());
                    }
                    return null;
                }
                this.f26531b = true;
                return m10247a();
            }
        }

        /* compiled from: FileTreeWalk.kt */
        /* renamed from: kotlin.io.e$b$b */
        /* loaded from: classes3.dex */
        private final class C11850b extends AbstractC11852c {

            /* renamed from: b */
            private boolean f26536b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11850b(C11848b c11848b, File file) {
                super(file);
                l.f(file, "rootFile");
                if (C13668y.f30115a) {
                    boolean isFile = file.isFile();
                    if (C13668y.f30115a && !isFile) {
                        throw new AssertionError("rootFile must be verified to be file beforehand.");
                    }
                }
            }

            @Override // kotlin.p492io.C11846e.AbstractC11852c
            /* renamed from: b */
            public File mo10246b() {
                if (this.f26536b) {
                    return null;
                }
                this.f26536b = true;
                return m10247a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: FileTreeWalk.kt */
        /* renamed from: kotlin.io.e$b$c */
        /* loaded from: classes3.dex */
        public final class C11851c extends AbstractC11847a {

            /* renamed from: b */
            private boolean f26537b;

            /* renamed from: c */
            private File[] f26538c;

            /* renamed from: d */
            private int f26539d;

            /* renamed from: e */
            final /* synthetic */ C11848b f26540e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11851c(C11848b c11848b, File file) {
                super(file);
                l.f(file, "rootDir");
                this.f26540e = c11848b;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
                if (r0.length == 0) goto L30;
             */
            @Override // kotlin.p492io.C11846e.AbstractC11852c
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File mo10246b() {
                /*
                    r10 = this;
                    boolean r0 = r10.f26537b
                    r1 = 0
                    if (r0 != 0) goto L28
                    kotlin.io.e$b r0 = r10.f26540e
                    kotlin.io.e r0 = kotlin.p492io.C11846e.this
                    kotlin.e0.c.l r0 = kotlin.p492io.C11846e.m10253d(r0)
                    if (r0 == 0) goto L20
                    java.io.File r2 = r10.m10247a()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    return r1
                L20:
                    r0 = 1
                    r10.f26537b = r0
                    java.io.File r0 = r10.m10247a()
                    return r0
                L28:
                    java.io.File[] r0 = r10.f26538c
                    if (r0 == 0) goto L4a
                    int r2 = r10.f26539d
                    kotlin.e0.d.l.d(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L35
                    goto L4a
                L35:
                    kotlin.io.e$b r0 = r10.f26540e
                    kotlin.io.e r0 = kotlin.p492io.C11846e.this
                    kotlin.e0.c.l r0 = kotlin.p492io.C11846e.m10251f(r0)
                    if (r0 == 0) goto L49
                    java.io.File r2 = r10.m10247a()
                    java.lang.Object r0 = r0.invoke(r2)
                    kotlin.w r0 = (kotlin.C13666w) r0
                L49:
                    return r1
                L4a:
                    java.io.File[] r0 = r10.f26538c
                    if (r0 != 0) goto L9c
                    java.io.File r0 = r10.m10247a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f26538c = r0
                    if (r0 != 0) goto L7d
                    kotlin.io.e$b r0 = r10.f26540e
                    kotlin.io.e r0 = kotlin.p492io.C11846e.this
                    kotlin.e0.c.p r0 = kotlin.p492io.C11846e.m10252e(r0)
                    if (r0 == 0) goto L7d
                    java.io.File r2 = r10.m10247a()
                    kotlin.io.AccessDeniedException r9 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r10.m10247a()
                    r5 = 0
                    r7 = 2
                    r8 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    java.lang.Object r0 = r0.invoke(r2, r9)
                    kotlin.w r0 = (kotlin.C13666w) r0
                L7d:
                    java.io.File[] r0 = r10.f26538c
                    if (r0 == 0) goto L87
                    kotlin.e0.d.l.d(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L9c
                L87:
                    kotlin.io.e$b r0 = r10.f26540e
                    kotlin.io.e r0 = kotlin.p492io.C11846e.this
                    kotlin.e0.c.l r0 = kotlin.p492io.C11846e.m10251f(r0)
                    if (r0 == 0) goto L9b
                    java.io.File r2 = r10.m10247a()
                    java.lang.Object r0 = r0.invoke(r2)
                    kotlin.w r0 = (kotlin.C13666w) r0
                L9b:
                    return r1
                L9c:
                    java.io.File[] r0 = r10.f26538c
                    kotlin.e0.d.l.d(r0)
                    int r1 = r10.f26539d
                    int r2 = r1 + 1
                    r10.f26539d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.p492io.C11846e.C11848b.C11851c.mo10246b():java.io.File");
            }
        }

        public C11848b() {
            if (C11846e.this.f26523a.isDirectory()) {
                this.f26529e.push(m10249g(C11846e.this.f26523a));
            } else if (C11846e.this.f26523a.isFile()) {
                this.f26529e.push(new C11850b(this, C11846e.this.f26523a));
            } else {
                m4158b();
            }
        }

        /* renamed from: g */
        private final AbstractC11847a m10249g(File file) {
            int i = C11853f.f26542a[C11846e.this.f26524b.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return new C11849a(this, file);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new C11851c(this, file);
        }

        /* renamed from: h */
        private final File m10248h() {
            File mo10246b;
            while (true) {
                AbstractC11852c peek = this.f26529e.peek();
                if (peek == null) {
                    return null;
                }
                mo10246b = peek.mo10246b();
                if (mo10246b == null) {
                    this.f26529e.pop();
                } else if (l.b(mo10246b, peek.m10247a()) || !mo10246b.isDirectory() || this.f26529e.size() >= C11846e.this.f26528f) {
                    break;
                } else {
                    this.f26529e.push(m10249g(mo10246b));
                }
            }
            return mo10246b;
        }

        @Override // kotlin.p557z.AbstractC13687c
        /* renamed from: a */
        protected void mo4159a() {
            File m10248h = m10248h();
            if (m10248h != null) {
                m4157c(m10248h);
            } else {
                m4158b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FileTreeWalk.kt */
    /* renamed from: kotlin.io.e$c */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC11852c {

        /* renamed from: a */
        private final File f26541a;

        public AbstractC11852c(File file) {
            l.f(file, "root");
            this.f26541a = file;
        }

        /* renamed from: a */
        public final File m10247a() {
            return this.f26541a;
        }

        /* renamed from: b */
        public abstract File mo10246b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C11846e(File file, EnumC11854g enumC11854g, InterfaceC11767l<? super File, Boolean> interfaceC11767l, InterfaceC11767l<? super File, C13666w> interfaceC11767l2, InterfaceC11771p<? super File, ? super IOException, C13666w> interfaceC11771p, int i) {
        this.f26523a = file;
        this.f26524b = enumC11854g;
        this.f26525c = interfaceC11767l;
        this.f26526d = interfaceC11767l2;
        this.f26527e = interfaceC11771p;
        this.f26528f = i;
    }

    @Override // kotlin.p548k0.InterfaceC13230h
    public Iterator<File> iterator() {
        return new C11848b();
    }

    /* synthetic */ C11846e(File file, EnumC11854g enumC11854g, InterfaceC11767l interfaceC11767l, InterfaceC11767l interfaceC11767l2, InterfaceC11771p interfaceC11771p, int i, int i2, g gVar) {
        this(file, (i2 & 2) != 0 ? EnumC11854g.TOP_DOWN : enumC11854g, interfaceC11767l, interfaceC11767l2, interfaceC11771p, (i2 & 32) != 0 ? Integer.MAX_VALUE : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11846e(File file, EnumC11854g enumC11854g) {
        this(file, enumC11854g, null, null, null, 0, 32, null);
        l.f(file, OpsMetricTracker.START);
        l.f(enumC11854g, "direction");
    }
}
