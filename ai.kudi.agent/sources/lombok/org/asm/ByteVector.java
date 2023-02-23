package lombok.org.asm;

import a.a.a.e0;
import a.a.a.h0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p484c.InterfaceC11771p;
import lombok.org.asm.asm.AbstractC14262o;
import lombok.org.asm.asm.Integer;
import lombok.org.asm.asm.Namespace;
import lombok.org.asm.asm.Paint;
/* loaded from: classes.dex */
public class ByteVector implements Label, InterfaceC14273j, AbstractElement {

    /* renamed from: c */
    public static final AtomicReferenceFieldUpdater f31268c;

    /* renamed from: a */
    public volatile java.lang.Object f31269a;

    /* renamed from: x */
    private volatile java.lang.Object f31270x;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        AtomicReferenceFieldUpdater $r0 = AtomicReferenceFieldUpdater.newUpdater(h0.class, java.lang.Object.class, "c");
        f31268c = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ByteVector(boolean z) {
        C14309t $r1 = z ? Plot.f31303f : Plot.f31299a;
        this.f31270x = $r1;
        this.f31269a = null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
        if (r6 != false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2400a(java.lang.Object r31, java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.ByteVector.m2400a(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f2  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2390a(lombok.org.asm.h0$b r33, java.lang.Object r34) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.ByteVector.m2390a(lombok.org.asm.h0$b, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public InterfaceC11719g.InterfaceC11722b m2397a(InterfaceC11719g.InterfaceC11724c interfaceC11724c) {
        InterfaceC11719g.InterfaceC11722b $r1 = InterfaceC11719g.InterfaceC11722b.C11723a.m10398b(this, interfaceC11724c);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // lombok.org.asm.Label
    /* renamed from: a */
    public final MenuItem mo2371a(InterfaceC14273j interfaceC14273j) {
        C14298p $r1 = new C14298p(this, interfaceC14273j);
        Object $r2 = C14314x.m2167a(this, true, false, $r1, 2, null);
        if ($r2 != null) {
            MenuItem $r4 = (MenuItem) $r2;
            return $r4;
        }
        NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type com.smartlook.coroutines.ChildHandle");
        throw $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0, types: [lombok.org.asm.q] */
    @Override // lombok.org.asm.Label
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final lombok.org.asm.Object mo2370a(boolean r30, boolean r31, kotlin.p483e0.p484c.InterfaceC11767l r32) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.ByteVector.mo2370a(boolean, boolean, kotlin.e0.c.l):lombok.org.asm.Object");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final C14247a m2392a(InterfaceC14267e interfaceC14267e) {
        C14247a $r2 = interfaceC14267e.mo2173a();
        if ($r2 != null) {
            return $r2;
        }
        boolean $z0 = interfaceC14267e instanceof C14309t;
        if ($z0) {
            return new C14247a();
        }
        boolean $z02 = interfaceC14267e instanceof AbstractC14276m;
        if ($z02) {
            AbstractC14276m $r3 = (AbstractC14276m) interfaceC14267e;
            add($r3);
            return null;
        }
        String $r5 = "State should have list: " + interfaceC14267e;
        IllegalStateException $r6 = new IllegalStateException($r5.toString());
        throw $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003f, code lost:
        if (r12 == false) goto L32;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final lombok.org.asm.AbstractC14276m m2396a(kotlin.p483e0.p484c.InterfaceC11767l r11, boolean r12) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            if (r12 == 0) goto L29
            boolean r12 = r11 instanceof lombok.org.asm.ExpandedMenuView
            if (r12 != 0) goto L9
            goto La
        L9:
            r1 = r11
        La:
            r3 = r1
            lombok.org.asm.ExpandedMenuView r3 = (lombok.org.asm.ExpandedMenuView) r3
            r2 = r3
            if (r2 == 0) goto L23
            boolean r12 = lombok.org.asm.Item.f31289c
            if (r12 == 0) goto L52
            J extends a.a.a.t r4 = r2.f31409a
            if (r4 != r10) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            if (r0 == 0) goto L1d
            return r2
        L1d:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L23:
            lombok.org.asm.Switch r6 = new lombok.org.asm.Switch
            r6.<init>(r10, r11)
            return r6
        L29:
            boolean r12 = r11 instanceof lombok.org.asm.AbstractC14276m
            if (r12 != 0) goto L2e
            goto L2f
        L2e:
            r1 = r11
        L2f:
            r8 = r1
            lombok.org.asm.m r8 = (lombok.org.asm.AbstractC14276m) r8
            r7 = r8
            if (r7 == 0) goto L4c
            boolean r12 = lombok.org.asm.Item.f31289c
            if (r12 == 0) goto L53
            J extends a.a.a.t r4 = r7.f31409a
            if (r4 != r10) goto L42
            boolean r12 = r7 instanceof lombok.org.asm.ExpandedMenuView
            if (r12 != 0) goto L42
            goto L43
        L42:
            r0 = 0
        L43:
            if (r0 == 0) goto L46
            return r7
        L46:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L4c:
            lombok.org.asm.LineAndPointFormatter r9 = new lombok.org.asm.LineAndPointFormatter
            r9.<init>(r10, r11)
            return r9
        L52:
            return r2
        L53:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.ByteVector.m2396a(kotlin.e0.c.l, boolean):lombok.org.asm.m");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final lombok.org.asm.C14298p m2393a(lombok.org.asm.asm.Integer r6) {
        /*
            r5 = this;
        L0:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto Lb
            lombok.org.asm.asm.Integer r6 = r6.get()
            goto L0
        Lb:
            lombok.org.asm.asm.Integer r1 = r6.getValue()
            r6 = r1
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L17
            goto Lb
        L17:
            boolean r0 = r1 instanceof lombok.org.asm.C14298p
            if (r0 == 0) goto L20
            r3 = r1
            lombok.org.asm.p r3 = (lombok.org.asm.C14298p) r3
            r2 = r3
            return r2
        L20:
            boolean r0 = r1 instanceof lombok.org.asm.C14247a
            if (r0 == 0) goto Lb
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.ByteVector.m2393a(lombok.org.asm.asm.Integer):lombok.org.asm.p");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // lombok.org.asm.Label
    /* renamed from: a */
    public void mo2372a(CancellationException cancellationException) {
        if (cancellationException == null) {
            String $r2 = m2386d();
            Segment $r1 = new Segment($r2, null, this);
            cancellationException = $r1;
        }
        m2401a((java.lang.Object) cancellationException);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m2395a(Label label) {
        boolean $z0 = Item.f31289c;
        if ($z0) {
            java.lang.Object $r2 = this.f31269a;
            boolean $z02 = ((MenuItem) $r2) == null;
            if (!$z02) {
                AssertionError $r4 = new AssertionError();
                throw $r4;
            }
        }
        if (label == null) {
            ClassWriter $r5 = ClassWriter.f31272b;
            this.f31269a = $r5;
            return;
        }
        label.mo2373a();
        MenuItem $r3 = label.mo2371a(this);
        this.f31269a = $r3;
        java.lang.Object $r22 = length();
        boolean $z03 = $r22 instanceof InterfaceC14267e;
        if (!$z03) {
            $r3.mo2359c();
            ClassWriter $r52 = ClassWriter.f31272b;
            this.f31269a = $r52;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:6:0x0011 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2394a(lombok.org.asm.C14247a r14, java.lang.Throwable r15) {
        /*
            r13 = this;
            java.lang.Object r0 = r14.next()
            if (r0 == 0) goto L52
            r2 = r0
            lombok.org.asm.asm.Integer r2 = (lombok.org.asm.asm.Integer) r2
            r1 = r2
            r3 = 0
        Lb:
            boolean r4 = kotlin.p483e0.p485d.Log_OC.append(r1, r14)
            r5 = 1
            r4 = r4 ^ r5
            if (r4 == 0) goto L49
            boolean r4 = r1 instanceof lombok.org.asm.ExpandedMenuView
            if (r4 == 0) goto L44
            r7 = r1
            lombok.org.asm.m r7 = (lombok.org.asm.AbstractC14276m) r7
            r6 = r7
            r6.m2262a(r15)     // Catch: java.lang.Throwable -> L1f
            goto L44
        L1f:
            r8 = move-exception
            if (r3 == 0) goto L26
            kotlin.C11706b.m10414a(r3, r8)
            goto L44
        L26:
            lombok.org.asm.IOException r3 = new lombok.org.asm.IOException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Exception in completion handler "
            r9.append(r10)
            r9.append(r6)
            java.lang.String r10 = " for "
            r9.append(r10)
            r9.append(r13)
            java.lang.String r11 = r9.toString()
            r3.<init>(r11, r8)
        L44:
            lombok.org.asm.asm.Integer r1 = r1.getValue()
            goto Lb
        L49:
            if (r3 == 0) goto L4e
            r13.m2384e(r3)
        L4e:
            r13.m2398a(r15)
            return
        L52:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException
        */
        //  java.lang.String r10 = "null cannot be cast to non-null type com.smartlook.coroutines.internal.Node /* = com.smartlook.coroutines.internal.LockFreeLinkedListNode */"
        /*
            r12.<init>(r10)
            goto L5a
        L5a:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.ByteVector.m2394a(lombok.org.asm.a, java.lang.Throwable):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m2391a(InterfaceC14267e interfaceC14267e, java.lang.Object $r3) {
        MenuItem $r4 = (MenuItem) this.f31269a;
        if ($r4 != null) {
            $r4.mo2359c();
            ClassWriter $r5 = ClassWriter.f31272b;
            this.f31269a = $r5;
        }
        boolean $z0 = $r3 instanceof C14264b;
        if (!$z0) {
            $r3 = null;
        }
        C14264b $r7 = (C14264b) $r3;
        Throwable $r6 = $r7 != null ? $r7.f31379a : null;
        boolean $z02 = interfaceC14267e instanceof AbstractC14276m;
        if (!$z02) {
            C14247a $r12 = interfaceC14267e.mo2173a();
            if ($r12 != null) {
                write($r12, $r6);
                return;
            }
            return;
        }
        try {
            AbstractC14276m $r8 = (AbstractC14276m) interfaceC14267e;
            $r8.m2262a($r6);
        } catch (Throwable $r62) {
            String $r11 = "Exception in completion handler " + interfaceC14267e + " for " + this;
            IOException $r9 = new IOException($r11, $r62);
            m2384e((Throwable) $r9);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // lombok.org.asm.Label
    /* renamed from: a */
    public final boolean mo2373a() {
        byte $b0;
        do {
            java.lang.Object $r1 = length();
            boolean $z0 = $r1 instanceof C14309t;
            if ($z0) {
                C14309t $r2 = (C14309t) $r1;
                boolean $z02 = $r2.f31490b;
                if (!$z02) {
                    AtomicReferenceFieldUpdater $r3 = f31268c;
                    C14309t $r22 = Plot.f31303f;
                    boolean $z03 = $r3.compareAndSet(this, $r1, $r22);
                    if ($z03) {
                        visitMethodInsn();
                        $b0 = 1;
                    }
                    $b0 = -1;
                }
                $b0 = 0;
            } else {
                boolean $z04 = $r1 instanceof C14299q;
                if ($z04) {
                    AtomicReferenceFieldUpdater $r32 = f31268c;
                    C14299q $r4 = (C14299q) $r1;
                    C14247a $r5 = $r4.f31462b;
                    boolean $z05 = $r32.compareAndSet(this, $r1, $r5);
                    if ($z05) {
                        visitMethodInsn();
                        $b0 = 1;
                    }
                    $b0 = -1;
                }
                $b0 = 0;
            }
            if ($b0 == 0) {
                return false;
            }
        } while ($b0 != 1);
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x004d A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2401a(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.ByteVector.m2401a(java.lang.Object):boolean");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final boolean m2399a(final java.lang.Object obj, C14247a c14247a, final AbstractC14276m abstractC14276m) {
        int $i0;
        AbstractC14262o abstractC14262o = new AbstractC14262o(abstractC14276m, abstractC14276m, this, obj) { // from class: lombok.org.asm.h0$c

            /* renamed from: l */
            public final /* synthetic */ ByteVector f31405l;

            /* renamed from: o */
            public final /* synthetic */ java.lang.Object f31406o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(abstractC14276m);
                this.f31405l = this;
                this.f31406o = obj;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: a */
            public java.lang.Object m2267a(java.lang.Object obj2) {
                Integer integer = (Integer) obj2;
                ByteVector $r4 = this.f31405l;
                java.lang.Object $r2 = $r4.length();
                java.lang.Object $r1 = this.f31406o;
                boolean $z0 = $r2 == $r1;
                if ($z0) {
                    return null;
                }
                java.lang.Object $r12 = lombok.org.asm.asm.Attribute.f31325b;
                return $r12;
            }
        };
        do {
            Integer $r5 = c14247a.get();
            $i0 = $r5.get(abstractC14276m, c14247a, abstractC14262o);
            if ($i0 == 1) {
                return true;
            }
        } while ($i0 != 2);
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final boolean m2398a(Throwable th) {
        if (add()) {
            return true;
        }
        boolean $z0 = th instanceof CancellationException;
        java.lang.Object $r3 = this.f31269a;
        MenuItem $r4 = (MenuItem) $r3;
        if ($r4 != null) {
            ClassWriter $r1 = ClassWriter.f31272b;
            if ($r4 == $r1) {
                return $z0;
            }
            boolean $z1 = $r4.mo2367d(th);
            return $z1 || $z0;
        }
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final boolean m2389a(final h0$b h0_b, C14298p c14298p, final java.lang.Object obj) {
        C14298p $r8;
        do {
            InterfaceC14273j $r5 = c14298p.f31461d;
            final C14298p c14298p2 = c14298p;
            Object $r6 = C14314x.m2167a($r5, false, false, new e0<a.a.a.t>(this, h0_b, c14298p2, obj) { // from class: lombok.org.asm.h0$a

                /* renamed from: a */
                public final ByteVector f31397a;

                /* renamed from: j */
                public final h0$b f31398j;

                /* renamed from: k */
                public final C14298p f31399k;

                /* renamed from: o */
                public final java.lang.Object f31400o;

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                /* JADX WARN: Illegal instructions before constructor call */
                {
                    /*
                        r1 = this;
                        lombok.org.asm.j r0 = r4.f31461d
                        r1.<init>(r0)
                        r1.f31397a = r2
                        r1.f31398j = r3
                        r1.f31399k = r4
                        r1.f31400o = r5
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.h0$a.<init>(lombok.org.asm.ByteVector, lombok.org.asm.h0$b, lombok.org.asm.p, java.lang.Object):void");
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                /* renamed from: a */
                public void m2272a(Throwable th) {
                    ByteVector $r3 = this.f31397a;
                    h0$b $r4 = this.f31398j;
                    C14298p $r52 = this.f31399k;
                    java.lang.Object $r1 = this.f31400o;
                    $r3.getClass();
                    boolean $z0 = Item.f31289c;
                    if ($z0) {
                        java.lang.Object $r62 = $r3.length();
                        boolean $z02 = $r62 == $r4;
                        if (!$z02) {
                            AssertionError $r7 = new AssertionError();
                            throw $r7;
                        }
                    }
                    C14298p $r53 = $r3.m2393a((Integer) $r52);
                    if ($r53 != null) {
                        boolean $z03 = $r3.m2389a($r4, $r53, $r1);
                        if ($z03) {
                            return;
                        }
                    }
                    $r3.append($r3.m2390a($r4, $r1));
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                    Throwable $r2 = (Throwable) obj2;
                    m2272a($r2);
                    C13666w r3 = C13666w.f30112a;
                    return r3;
                }
            }, 1, null);
            ClassWriter $r7 = ClassWriter.f31272b;
            if ($r6 != $r7) {
                return true;
            }
            $r8 = m2393a((Integer) c14298p);
            c14298p = $r8;
        } while ($r8 != null);
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Throwable add(java.lang.Object obj) {
        boolean $z0 = obj != null ? obj instanceof Throwable : true;
        if ($z0) {
            if (obj != null) {
                Throwable $r2 = (Throwable) obj;
                return $r2;
            }
            String $r4 = m2386d();
            Segment $r3 = new Segment($r4, null, this);
            return $r3;
        } else if (obj == null) {
            NullPointerException $r7 = new NullPointerException("null cannot be cast to non-null type com.smartlook.coroutines.ParentJob");
            throw $r7;
        } else {
            AbstractElement $r5 = (AbstractElement) obj;
            CancellationException $r6 = $r5.write();
            return $r6;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CancellationException add(Throwable th, String $r2) {
        boolean $z0 = th instanceof CancellationException;
        Throwable $r3 = !$z0 ? null : th;
        CancellationException $r4 = (CancellationException) $r3;
        if ($r4 != null) {
            return $r4;
        }
        if ($r2 == null) {
            $r2 = m2386d();
        }
        Segment $r5 = new Segment($r2, th, this);
        return $r5;
    }

    @Override // lombok.org.asm.InterfaceC14273j
    public final void add(AbstractElement abstractElement) {
        m2401a((java.lang.Object) abstractElement);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(AbstractC14276m abstractC14276m) {
        C14247a $r2 = new C14247a();
        AtomicReferenceFieldUpdater $r3 = Integer.pool;
        $r3.lazySet($r2, abstractC14276m);
        AtomicReferenceFieldUpdater $r32 = Integer.buffer;
        $r32.lazySet($r2, abstractC14276m);
        while (true) {
            java.lang.Object $r4 = abstractC14276m.next();
            if ($r4 == abstractC14276m) {
                AtomicReferenceFieldUpdater $r33 = Integer.buffer;
                boolean $z0 = $r33.compareAndSet(abstractC14276m, abstractC14276m, $r2);
                if ($z0) {
                    $r2.add(abstractC14276m);
                    break;
                }
            } else {
                break;
            }
        }
        Integer $r5 = abstractC14276m.getValue();
        AtomicReferenceFieldUpdater $r34 = f31268c;
        $r34.compareAndSet(this, abstractC14276m, $r5);
    }

    public boolean add() {
        return false;
    }

    public void append(java.lang.Object obj) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final java.lang.Object m2388b(java.lang.Object $r1) {
        java.lang.Object $r2;
        Paint $r3;
        do {
            $r2 = m2400a(length(), $r1);
            Paint $r32 = Plot.f31301d;
            if ($r2 == $r32) {
                String $r6 = "Job " + this + " is already complete or completing, but is being completed with " + $r1;
                boolean $z0 = $r1 instanceof C14264b;
                if (!$z0) {
                    $r1 = null;
                }
                C14264b $r8 = (C14264b) $r1;
                Throwable $r7 = $r8 != null ? $r8.f31379a : null;
                IllegalStateException $r4 = new IllegalStateException($r6, $r7);
                throw $r4;
            }
            $r3 = Plot.f31300b;
        } while ($r2 == $r3);
        return $r2;
    }

    /* renamed from: b */
    public boolean m2387b(Throwable th) {
        return false;
    }

    /* renamed from: d */
    public String m2386d() {
        return "Job was cancelled";
    }

    /* renamed from: e */
    public void m2385e(java.lang.Object obj) {
    }

    /* renamed from: e */
    public void m2384e(Throwable th) {
        throw th;
    }

    public boolean equals() {
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p476c0.InterfaceC11719g
    public java.lang.Object fold(java.lang.Object obj, InterfaceC11771p interfaceC11771p) {
        java.lang.Object $r2 = InterfaceC11719g.InterfaceC11722b.C11723a.m10399a(this, obj, interfaceC11771p);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String get() {
        Class $r1 = getClass();
        String $r2 = $r1.getSimpleName();
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p476c0.InterfaceC11719g.InterfaceC11722b
    public final InterfaceC11719g.InterfaceC11724c getKey() {
        Token r1 = Label.f31291c;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getSize(java.lang.Object obj) {
        boolean $z0 = obj instanceof h0$b;
        if ($z0) {
            h0$b $r2 = (h0$b) obj;
            boolean $z02 = $r2.m2268e();
            if ($z02) {
                return "Cancelling";
            }
            boolean $z03 = $r2.m2269d();
            return $z03 ? "Completing" : "Active";
        }
        boolean $z04 = obj instanceof InterfaceC14267e;
        if (!$z04) {
            boolean $z05 = obj instanceof C14264b;
            return $z05 ? "Cancelled" : "Completed";
        }
        InterfaceC14267e $r3 = (InterfaceC14267e) obj;
        boolean $z06 = $r3.mo2172b();
        return $z06 ? "Active" : "New";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // lombok.org.asm.Label
    public final CancellationException getValue() {
        java.lang.Object $r1 = length();
        boolean $z0 = $r1 instanceof h0$b;
        if ($z0) {
            h0$b $r2 = (h0$b) $r1;
            Throwable $r3 = (Throwable) $r2.f31401a;
            if ($r3 == null) {
                String $r6 = "Job is still new or active: " + this;
                IllegalStateException $r8 = new IllegalStateException($r6.toString());
                throw $r8;
            }
            StringBuilder $r4 = new StringBuilder();
            Class $r5 = getClass();
            String $r62 = $r5.getSimpleName();
            $r4.append($r62);
            $r4.append(" is cancelling");
            String $r63 = $r4.toString();
            CancellationException $r7 = add($r3, $r63);
            return $r7;
        }
        boolean $z02 = $r1 instanceof InterfaceC14267e;
        if ($z02) {
            String $r64 = "Job is still new or active: " + this;
            IllegalStateException $r82 = new IllegalStateException($r64.toString());
            throw $r82;
        }
        boolean $z03 = $r1 instanceof C14264b;
        if ($z03) {
            CancellationException $r72 = add(((C14264b) $r1).f31379a, null);
            return $r72;
        }
        StringBuilder $r42 = new StringBuilder();
        Class $r52 = getClass();
        String $r65 = $r52.getSimpleName();
        $r42.append($r65);
        $r42.append(" has completed normally");
        String $r66 = $r42.toString();
        Segment $r10 = new Segment($r66, null, this);
        return $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final java.lang.Object length() {
        while (true) {
            java.lang.Object $r1 = this.f31270x;
            boolean $z0 = $r1 instanceof Namespace;
            if (!$z0) {
                return $r1;
            }
            Namespace $r2 = (Namespace) $r1;
            $r2.get(this);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p476c0.InterfaceC11719g
    public InterfaceC11719g minusKey(InterfaceC11719g.InterfaceC11724c interfaceC11724c) {
        InterfaceC11719g $r1 = InterfaceC11719g.InterfaceC11722b.C11723a.m10397c(this, interfaceC11724c);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p476c0.InterfaceC11719g
    public InterfaceC11719g plus(InterfaceC11719g interfaceC11719g) {
        InterfaceC11719g $r1 = InterfaceC11719g.InterfaceC11722b.C11723a.m10396d(this, interfaceC11719g);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // lombok.org.asm.Label
    public boolean put() {
        java.lang.Object $r1 = length();
        boolean $z0 = $r1 instanceof InterfaceC14267e;
        if ($z0) {
            InterfaceC14267e $r2 = (InterfaceC14267e) $r1;
            boolean $z02 = $r2.mo2172b();
            return $z02;
        }
        return false;
    }

    public boolean putInt() {
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r1 = new StringBuilder();
        StringBuilder $r2 = new StringBuilder();
        String $r3 = get();
        $r2.append($r3);
        $r2.append('{');
        java.lang.Object $r4 = length();
        String $r32 = getSize($r4);
        $r2.append($r32);
        $r2.append('}');
        String $r33 = $r2.toString();
        $r1.append($r33);
        $r1.append('@');
        int $i0 = System.identityHashCode(this);
        String $r34 = Integer.toHexString($i0);
        $r1.append($r34);
        String $r35 = $r1.toString();
        return $r35;
    }

    public void visitMethodInsn() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // lombok.org.asm.AbstractElement
    public CancellationException write() {
        Throwable $r5;
        java.lang.Object $r1 = length();
        boolean $z0 = $r1 instanceof h0$b;
        if ($z0) {
            h0$b $r3 = (h0$b) $r1;
            java.lang.Object $r4 = $r3.f31401a;
            $r5 = (Throwable) $r4;
        } else {
            boolean $z02 = $r1 instanceof C14264b;
            if ($z02) {
                C14264b $r6 = (C14264b) $r1;
                $r5 = $r6.f31379a;
            } else {
                boolean $z03 = $r1 instanceof InterfaceC14267e;
                if ($z03) {
                    String $r10 = "Cannot be cancelling child in this state: " + $r1;
                    IllegalStateException $r11 = new IllegalStateException($r10.toString());
                    throw $r11;
                }
                $r5 = null;
            }
        }
        boolean $z04 = $r5 instanceof CancellationException;
        CancellationException $r2 = $z04 ? $r5 : null;
        CancellationException $r7 = $r2;
        if ($r7 != null) {
            return $r7;
        }
        StringBuilder $r9 = new StringBuilder();
        $r9.append("Parent job is ");
        String $r102 = getSize($r1);
        $r9.append($r102);
        String $r103 = $r9.toString();
        Segment $r8 = new Segment($r103, $r5, this);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:11:0x0027 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void write(java.lang.Throwable r11, java.util.List r12) {
        /*
            r10 = this;
            int r0 = r12.size()
            r1 = 1
            if (r0 > r1) goto L8
            return
        L8:
            int r0 = r12.size()
            java.util.IdentityHashMap r2 = new java.util.IdentityHashMap
            r2.<init>(r0)
            java.util.Set r3 = java.util.Collections.newSetFromMap(r2)
            boolean r4 = lombok.org.asm.Item.f31288b
            if (r4 != 0) goto L1b
            r5 = r11
            goto L1f
        L1b:
            java.lang.Throwable r5 = lombok.org.asm.asm.ClassWriter.get(r11)
        L1f:
            java.util.Iterator r6 = r12.iterator()
        L23:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L4c
            java.lang.Object r7 = r6.next()
            r9 = r7
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8 = r9
            boolean r4 = lombok.org.asm.Item.f31288b
            if (r4 != 0) goto L36
            goto L3a
        L36:
            java.lang.Throwable r8 = lombok.org.asm.asm.ClassWriter.get(r8)
        L3a:
            if (r8 == r11) goto L23
            if (r8 == r5) goto L23
            boolean r4 = r8 instanceof java.util.concurrent.CancellationException
            if (r4 != 0) goto L23
            boolean r4 = r3.add(r8)
            if (r4 == 0) goto L23
            kotlin.C11706b.m10414a(r11, r8)
            goto L23
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.ByteVector.write(java.lang.Throwable, java.util.List):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:6:0x0011 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void write(lombok.org.asm.C14247a r14, java.lang.Throwable r15) {
        /*
            r13 = this;
            java.lang.Object r0 = r14.next()
            if (r0 == 0) goto L4f
            r2 = r0
            lombok.org.asm.asm.Integer r2 = (lombok.org.asm.asm.Integer) r2
            r1 = r2
            r3 = 0
        Lb:
            boolean r4 = kotlin.p483e0.p485d.Log_OC.append(r1, r14)
            r5 = 1
            r4 = r4 ^ r5
            if (r4 == 0) goto L49
            boolean r4 = r1 instanceof lombok.org.asm.AbstractC14276m
            if (r4 == 0) goto L44
            r7 = r1
            lombok.org.asm.m r7 = (lombok.org.asm.AbstractC14276m) r7
            r6 = r7
            r6.m2262a(r15)     // Catch: java.lang.Throwable -> L1f
            goto L44
        L1f:
            r8 = move-exception
            if (r3 == 0) goto L26
            kotlin.C11706b.m10414a(r3, r8)
            goto L44
        L26:
            lombok.org.asm.IOException r3 = new lombok.org.asm.IOException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Exception in completion handler "
            r9.append(r10)
            r9.append(r6)
            java.lang.String r10 = " for "
            r9.append(r10)
            r9.append(r13)
            java.lang.String r11 = r9.toString()
            r3.<init>(r11, r8)
        L44:
            lombok.org.asm.asm.Integer r1 = r1.getValue()
            goto Lb
        L49:
            if (r3 == 0) goto L58
            r13.m2384e(r3)
            return
        L4f:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException
        */
        //  java.lang.String r10 = "null cannot be cast to non-null type com.smartlook.coroutines.internal.Node /* = com.smartlook.coroutines.internal.LockFreeLinkedListNode */"
        /*
            r12.<init>(r10)
            goto L57
        L57:
            throw r12
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.ByteVector.write(lombok.org.asm.a, java.lang.Throwable):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean write(Throwable th) {
        boolean $z0 = th instanceof CancellationException;
        if ($z0) {
            return true;
        }
        boolean $z02 = m2401a((java.lang.Object) th);
        if ($z02) {
            boolean $z03 = equals();
            return $z03;
        }
        return false;
    }
}
