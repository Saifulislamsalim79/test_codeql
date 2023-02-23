package com.google.common.util.concurrent;

import com.google.common.collect.AbstractC5079k;
import com.google.common.collect.C5082m;
import com.google.common.collect.C5083n;
import java.util.ArrayList;
import java.util.logging.Logger;
/* loaded from: classes2.dex */
public class CycleDetectingLockFactory {

    /* loaded from: classes2.dex */
    public static final class PotentialDeadlockException extends C5144b {

        /* renamed from: c */
        private final C5144b f12829c;

        @Override // java.lang.Throwable
        public String getMessage() {
            StringBuilder sb = new StringBuilder(super.getMessage());
            for (Throwable th = this.f12829c; th != null; th = th.getCause()) {
                sb.append(", ");
                sb.append(th.getMessage());
            }
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$a */
    /* loaded from: classes2.dex */
    class C5143a extends ThreadLocal<ArrayList<C5145c>> {
        C5143a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public ArrayList<C5145c> initialValue() {
            return C5082m.m25701f(3);
        }
    }

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$b */
    /* loaded from: classes2.dex */
    private static class C5144b extends IllegalStateException {
        static {
            AbstractC5079k.m25713P(CycleDetectingLockFactory.class.getName(), C5144b.class.getName(), C5145c.class.getName());
        }
    }

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$c */
    /* loaded from: classes2.dex */
    private static class C5145c {
    }

    static {
        C5083n c5083n = new C5083n();
        c5083n.m25693h();
        c5083n.m25695f();
        Logger.getLogger(CycleDetectingLockFactory.class.getName());
        new C5143a();
    }
}
