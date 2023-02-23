package com.squareup.picasso;

import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.C7356r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Dispatcher.java */
/* renamed from: com.squareup.picasso.i */
/* loaded from: classes2.dex */
public class C7340i {

    /* renamed from: a */
    final HandlerThreadC7343b f17377a;

    /* renamed from: b */
    final Context f17378b;

    /* renamed from: c */
    final ExecutorService f17379c;

    /* renamed from: d */
    final InterfaceC7345j f17380d;

    /* renamed from: e */
    final Map<String, RunnableC7323c> f17381e;

    /* renamed from: f */
    final Map<Object, AbstractC7316a> f17382f;

    /* renamed from: g */
    final Map<Object, AbstractC7316a> f17383g;

    /* renamed from: h */
    final Set<Object> f17384h;

    /* renamed from: i */
    final Handler f17385i;

    /* renamed from: j */
    final Handler f17386j;

    /* renamed from: k */
    final InterfaceC7331d f17387k;

    /* renamed from: l */
    final C7318a0 f17388l;

    /* renamed from: m */
    final List<RunnableC7323c> f17389m;

    /* renamed from: n */
    final C7344c f17390n;

    /* renamed from: o */
    final boolean f17391o;

    /* renamed from: p */
    boolean f17392p;

    /* compiled from: Dispatcher.java */
    /* renamed from: com.squareup.picasso.i$a */
    /* loaded from: classes2.dex */
    private static class HandlerC7341a extends Handler {

        /* renamed from: a */
        private final C7340i f17393a;

        /* compiled from: Dispatcher.java */
        /* renamed from: com.squareup.picasso.i$a$a */
        /* loaded from: classes2.dex */
        class RunnableC7342a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ Message f17394c;

            RunnableC7342a(HandlerC7341a handlerC7341a, Message message) {
                this.f17394c = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.f17394c.what);
            }
        }

        HandlerC7341a(Looper looper, C7340i c7340i) {
            super(looper);
            this.f17393a = c7340i;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.f17393a.m18912v((AbstractC7316a) message.obj);
                    return;
                case 2:
                    this.f17393a.m18919o((AbstractC7316a) message.obj);
                    return;
                case 3:
                case 8:
                default:
                    C7360t.f17429p.post(new RunnableC7342a(this, message));
                    return;
                case 4:
                    this.f17393a.m18918p((RunnableC7323c) message.obj);
                    return;
                case 5:
                    this.f17393a.m18913u((RunnableC7323c) message.obj);
                    return;
                case 6:
                    this.f17393a.m18917q((RunnableC7323c) message.obj, false);
                    return;
                case 7:
                    this.f17393a.m18920n();
                    return;
                case 9:
                    this.f17393a.m18916r((NetworkInfo) message.obj);
                    return;
                case 10:
                    this.f17393a.m18921m(message.arg1 == 1);
                    return;
                case 11:
                    this.f17393a.m18915s(message.obj);
                    return;
                case 12:
                    this.f17393a.m18914t(message.obj);
                    return;
            }
        }
    }

    /* compiled from: Dispatcher.java */
    /* renamed from: com.squareup.picasso.i$b */
    /* loaded from: classes2.dex */
    static class HandlerThreadC7343b extends HandlerThread {
        HandlerThreadC7343b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* compiled from: Dispatcher.java */
    /* renamed from: com.squareup.picasso.i$c */
    /* loaded from: classes2.dex */
    static class C7344c extends BroadcastReceiver {

        /* renamed from: a */
        private final C7340i f17395a;

        C7344c(C7340i c7340i) {
            this.f17395a = c7340i;
        }

        /* renamed from: a */
        void m18910a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f17395a.f17391o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f17395a.f17378b.registerReceiver(this, intentFilter);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                if (intent.hasExtra(SendReceiptToTerminalConfirmationBottomSheet.STATE)) {
                    this.f17395a.m18932b(intent.getBooleanExtra(SendReceiptToTerminalConfirmationBottomSheet.STATE, false));
                }
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                this.f17395a.m18928f(((ConnectivityManager) C7332d0.m18943n(context, "connectivity")).getActiveNetworkInfo());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7340i(Context context, ExecutorService executorService, Handler handler, InterfaceC7345j interfaceC7345j, InterfaceC7331d interfaceC7331d, C7318a0 c7318a0) {
        HandlerThreadC7343b handlerThreadC7343b = new HandlerThreadC7343b();
        this.f17377a = handlerThreadC7343b;
        handlerThreadC7343b.start();
        C7332d0.m18949h(this.f17377a.getLooper());
        this.f17378b = context;
        this.f17379c = executorService;
        this.f17381e = new LinkedHashMap();
        this.f17382f = new WeakHashMap();
        this.f17383g = new WeakHashMap();
        this.f17384h = new LinkedHashSet();
        this.f17385i = new HandlerC7341a(this.f17377a.getLooper(), this);
        this.f17380d = interfaceC7345j;
        this.f17386j = handler;
        this.f17387k = interfaceC7331d;
        this.f17388l = c7318a0;
        this.f17389m = new ArrayList(4);
        this.f17392p = C7332d0.m18941p(this.f17378b);
        this.f17391o = C7332d0.m18942o(context, "android.permission.ACCESS_NETWORK_STATE");
        C7344c c7344c = new C7344c(this);
        this.f17390n = c7344c;
        c7344c.m18910a();
    }

    /* renamed from: a */
    private void m18933a(RunnableC7323c runnableC7323c) {
        if (runnableC7323c.m18963u()) {
            return;
        }
        Bitmap bitmap = runnableC7323c.f17348E;
        if (bitmap != null) {
            bitmap.prepareToDraw();
        }
        this.f17389m.add(runnableC7323c);
        if (this.f17385i.hasMessages(7)) {
            return;
        }
        this.f17385i.sendEmptyMessageDelayed(7, 200L);
    }

    /* renamed from: i */
    private void m18925i() {
        if (this.f17382f.isEmpty()) {
            return;
        }
        Iterator<AbstractC7316a> it = this.f17382f.values().iterator();
        while (it.hasNext()) {
            AbstractC7316a next = it.next();
            it.remove();
            if (next.m19005g().f17444n) {
                C7332d0.m18938s("Dispatcher", "replaying", next.m19003i().m18860d());
            }
            m18911w(next, false);
        }
    }

    /* renamed from: j */
    private void m18924j(List<RunnableC7323c> list) {
        if (list == null || list.isEmpty() || !list.get(0).m18967q().f17444n) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (RunnableC7323c runnableC7323c : list) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(C7332d0.m18947j(runnableC7323c));
        }
        C7332d0.m18938s("Dispatcher", "delivered", sb.toString());
    }

    /* renamed from: k */
    private void m18923k(AbstractC7316a abstractC7316a) {
        Object m19001k = abstractC7316a.m19001k();
        if (m19001k != null) {
            abstractC7316a.f17303k = true;
            this.f17382f.put(m19001k, abstractC7316a);
        }
    }

    /* renamed from: l */
    private void m18922l(RunnableC7323c runnableC7323c) {
        AbstractC7316a m18976h = runnableC7323c.m18976h();
        if (m18976h != null) {
            m18923k(m18976h);
        }
        List<AbstractC7316a> m18975i = runnableC7323c.m18975i();
        if (m18975i != null) {
            int size = m18975i.size();
            for (int i = 0; i < size; i++) {
                m18923k(m18975i.get(i));
            }
        }
    }

    /* renamed from: b */
    void m18932b(boolean z) {
        Handler handler = this.f17385i;
        handler.sendMessage(handler.obtainMessage(10, z ? 1 : 0, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m18931c(AbstractC7316a abstractC7316a) {
        Handler handler = this.f17385i;
        handler.sendMessage(handler.obtainMessage(2, abstractC7316a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m18930d(RunnableC7323c runnableC7323c) {
        Handler handler = this.f17385i;
        handler.sendMessage(handler.obtainMessage(4, runnableC7323c));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m18929e(RunnableC7323c runnableC7323c) {
        Handler handler = this.f17385i;
        handler.sendMessage(handler.obtainMessage(6, runnableC7323c));
    }

    /* renamed from: f */
    void m18928f(NetworkInfo networkInfo) {
        Handler handler = this.f17385i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m18927g(RunnableC7323c runnableC7323c) {
        Handler handler = this.f17385i;
        handler.sendMessageDelayed(handler.obtainMessage(5, runnableC7323c), 500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m18926h(AbstractC7316a abstractC7316a) {
        Handler handler = this.f17385i;
        handler.sendMessage(handler.obtainMessage(1, abstractC7316a));
    }

    /* renamed from: m */
    void m18921m(boolean z) {
        this.f17392p = z;
    }

    /* renamed from: n */
    void m18920n() {
        ArrayList arrayList = new ArrayList(this.f17389m);
        this.f17389m.clear();
        Handler handler = this.f17386j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        m18924j(arrayList);
    }

    /* renamed from: o */
    void m18919o(AbstractC7316a abstractC7316a) {
        String m19008d = abstractC7316a.m19008d();
        RunnableC7323c runnableC7323c = this.f17381e.get(m19008d);
        if (runnableC7323c != null) {
            runnableC7323c.m18978f(abstractC7316a);
            if (runnableC7323c.m18981c()) {
                this.f17381e.remove(m19008d);
                if (abstractC7316a.m19005g().f17444n) {
                    C7332d0.m18938s("Dispatcher", "canceled", abstractC7316a.m19003i().m18860d());
                }
            }
        }
        if (this.f17384h.contains(abstractC7316a.m19002j())) {
            this.f17383g.remove(abstractC7316a.m19001k());
            if (abstractC7316a.m19005g().f17444n) {
                C7332d0.m18937t("Dispatcher", "canceled", abstractC7316a.m19003i().m18860d(), "because paused request got canceled");
            }
        }
        AbstractC7316a remove = this.f17382f.remove(abstractC7316a.m19001k());
        if (remove == null || !remove.m19005g().f17444n) {
            return;
        }
        C7332d0.m18937t("Dispatcher", "canceled", remove.m19003i().m18860d(), "from replaying");
    }

    /* renamed from: p */
    void m18918p(RunnableC7323c runnableC7323c) {
        if (EnumC7354p.m18893b(runnableC7323c.m18968p())) {
            this.f17387k.mo18903c(runnableC7323c.m18970n(), runnableC7323c.m18965s());
        }
        this.f17381e.remove(runnableC7323c.m18970n());
        m18933a(runnableC7323c);
        if (runnableC7323c.m18967q().f17444n) {
            C7332d0.m18937t("Dispatcher", "batched", C7332d0.m18947j(runnableC7323c), "for completion");
        }
    }

    /* renamed from: q */
    void m18917q(RunnableC7323c runnableC7323c, boolean z) {
        if (runnableC7323c.m18967q().f17444n) {
            String m18947j = C7332d0.m18947j(runnableC7323c);
            StringBuilder sb = new StringBuilder();
            sb.append("for error");
            sb.append(z ? " (will replay)" : "");
            C7332d0.m18937t("Dispatcher", "batched", m18947j, sb.toString());
        }
        this.f17381e.remove(runnableC7323c.m18970n());
        m18933a(runnableC7323c);
    }

    /* renamed from: r */
    void m18916r(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f17379c;
        if (executorService instanceof C7371v) {
            ((C7371v) executorService).m18866a(networkInfo);
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return;
        }
        m18925i();
    }

    /* renamed from: s */
    void m18915s(Object obj) {
        if (this.f17384h.add(obj)) {
            Iterator<RunnableC7323c> it = this.f17381e.values().iterator();
            while (it.hasNext()) {
                RunnableC7323c next = it.next();
                boolean z = next.m18967q().f17444n;
                AbstractC7316a m18976h = next.m18976h();
                List<AbstractC7316a> m18975i = next.m18975i();
                boolean z2 = (m18975i == null || m18975i.isEmpty()) ? false : true;
                if (m18976h != null || z2) {
                    if (m18976h != null && m18976h.m19002j().equals(obj)) {
                        next.m18978f(m18976h);
                        this.f17383g.put(m18976h.m19001k(), m18976h);
                        if (z) {
                            C7332d0.m18937t("Dispatcher", "paused", m18976h.f17294b.m18860d(), "because tag '" + obj + "' was paused");
                        }
                    }
                    if (z2) {
                        for (int size = m18975i.size() - 1; size >= 0; size--) {
                            AbstractC7316a abstractC7316a = m18975i.get(size);
                            if (abstractC7316a.m19002j().equals(obj)) {
                                next.m18978f(abstractC7316a);
                                this.f17383g.put(abstractC7316a.m19001k(), abstractC7316a);
                                if (z) {
                                    C7332d0.m18937t("Dispatcher", "paused", abstractC7316a.f17294b.m18860d(), "because tag '" + obj + "' was paused");
                                }
                            }
                        }
                    }
                    if (next.m18981c()) {
                        it.remove();
                        if (z) {
                            C7332d0.m18937t("Dispatcher", "canceled", C7332d0.m18947j(next), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    /* renamed from: t */
    void m18914t(Object obj) {
        if (this.f17384h.remove(obj)) {
            ArrayList arrayList = null;
            Iterator<AbstractC7316a> it = this.f17383g.values().iterator();
            while (it.hasNext()) {
                AbstractC7316a next = it.next();
                if (next.m19002j().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.f17386j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    /* renamed from: u */
    void m18913u(RunnableC7323c runnableC7323c) {
        if (runnableC7323c.m18963u()) {
            return;
        }
        boolean z = false;
        if (this.f17379c.isShutdown()) {
            m18917q(runnableC7323c, false);
            return;
        }
        if (runnableC7323c.m18961w(this.f17392p, this.f17391o ? ((ConnectivityManager) C7332d0.m18943n(this.f17378b, "connectivity")).getActiveNetworkInfo() : null)) {
            if (runnableC7323c.m18967q().f17444n) {
                C7332d0.m18938s("Dispatcher", "retrying", C7332d0.m18947j(runnableC7323c));
            }
            if (runnableC7323c.m18973k() instanceof C7356r.C7357a) {
                runnableC7323c.f17344A |= EnumC7355q.NO_CACHE.f17423c;
            }
            runnableC7323c.f17349F = this.f17379c.submit(runnableC7323c);
            return;
        }
        if (this.f17391o && runnableC7323c.m18960x()) {
            z = true;
        }
        m18917q(runnableC7323c, z);
        if (z) {
            m18922l(runnableC7323c);
        }
    }

    /* renamed from: v */
    void m18912v(AbstractC7316a abstractC7316a) {
        m18911w(abstractC7316a, true);
    }

    /* renamed from: w */
    void m18911w(AbstractC7316a abstractC7316a, boolean z) {
        if (this.f17384h.contains(abstractC7316a.m19002j())) {
            this.f17383g.put(abstractC7316a.m19001k(), abstractC7316a);
            if (abstractC7316a.m19005g().f17444n) {
                String m18860d = abstractC7316a.f17294b.m18860d();
                C7332d0.m18937t("Dispatcher", "paused", m18860d, "because tag '" + abstractC7316a.m19002j() + "' is paused");
                return;
            }
            return;
        }
        RunnableC7323c runnableC7323c = this.f17381e.get(abstractC7316a.m19008d());
        if (runnableC7323c != null) {
            runnableC7323c.m18982b(abstractC7316a);
        } else if (this.f17379c.isShutdown()) {
            if (abstractC7316a.m19005g().f17444n) {
                C7332d0.m18937t("Dispatcher", "ignored", abstractC7316a.f17294b.m18860d(), "because shut down");
            }
        } else {
            RunnableC7323c m18977g = RunnableC7323c.m18977g(abstractC7316a.m19005g(), this, this.f17387k, this.f17388l, abstractC7316a);
            m18977g.f17349F = this.f17379c.submit(m18977g);
            this.f17381e.put(abstractC7316a.m19008d(), m18977g);
            if (z) {
                this.f17382f.remove(abstractC7316a.m19001k());
            }
            if (abstractC7316a.m19005g().f17444n) {
                C7332d0.m18938s("Dispatcher", "enqueued", abstractC7316a.f17294b.m18860d());
            }
        }
    }
}
