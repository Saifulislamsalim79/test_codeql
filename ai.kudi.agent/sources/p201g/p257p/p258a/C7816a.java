package p201g.p257p.p258a;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
/* compiled from: LocalBroadcastManager.java */
/* renamed from: g.p.a.a */
/* loaded from: classes2.dex */
public final class C7816a {

    /* renamed from: f */
    private static final Object f18667f = new Object();

    /* renamed from: g */
    private static C7816a f18668g;

    /* renamed from: a */
    private final Context f18669a;

    /* renamed from: b */
    private final HashMap<BroadcastReceiver, ArrayList<C7819c>> f18670b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, ArrayList<C7819c>> f18671c = new HashMap<>();

    /* renamed from: d */
    private final ArrayList<C7818b> f18672d = new ArrayList<>();

    /* renamed from: e */
    private final Handler f18673e;

    /* compiled from: LocalBroadcastManager.java */
    /* renamed from: g.p.a.a$a */
    /* loaded from: classes2.dex */
    class HandlerC7817a extends Handler {
        HandlerC7817a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                C7816a.this.m17240a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LocalBroadcastManager.java */
    /* renamed from: g.p.a.a$b */
    /* loaded from: classes2.dex */
    public static final class C7818b {

        /* renamed from: a */
        final Intent f18675a;

        /* renamed from: b */
        final ArrayList<C7819c> f18676b;

        C7818b(Intent intent, ArrayList<C7819c> arrayList) {
            this.f18675a = intent;
            this.f18676b = arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LocalBroadcastManager.java */
    /* renamed from: g.p.a.a$c */
    /* loaded from: classes2.dex */
    public static final class C7819c {

        /* renamed from: a */
        final IntentFilter f18677a;

        /* renamed from: b */
        final BroadcastReceiver f18678b;

        /* renamed from: c */
        boolean f18679c;

        /* renamed from: d */
        boolean f18680d;

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f18678b);
            sb.append(" filter=");
            sb.append(this.f18677a);
            if (this.f18680d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private C7816a(Context context) {
        this.f18669a = context;
        this.f18673e = new HandlerC7817a(context.getMainLooper());
    }

    /* renamed from: b */
    public static C7816a m17239b(Context context) {
        C7816a c7816a;
        synchronized (f18667f) {
            if (f18668g == null) {
                f18668g = new C7816a(context.getApplicationContext());
            }
            c7816a = f18668g;
        }
        return c7816a;
    }

    /* renamed from: a */
    void m17240a() {
        int size;
        C7818b[] c7818bArr;
        while (true) {
            synchronized (this.f18670b) {
                size = this.f18672d.size();
                if (size <= 0) {
                    return;
                }
                c7818bArr = new C7818b[size];
                this.f18672d.toArray(c7818bArr);
                this.f18672d.clear();
            }
            for (int i = 0; i < size; i++) {
                C7818b c7818b = c7818bArr[i];
                int size2 = c7818b.f18676b.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C7819c c7819c = c7818b.f18676b.get(i2);
                    if (!c7819c.f18680d) {
                        c7819c.f18678b.onReceive(this.f18669a, c7818b.f18675a);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public boolean m17238c(Intent intent) {
        int i;
        String str;
        ArrayList arrayList;
        ArrayList<C7819c> arrayList2;
        String str2;
        synchronized (this.f18670b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f18669a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<C7819c> arrayList3 = this.f18671c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                }
                ArrayList arrayList4 = null;
                int i2 = 0;
                while (i2 < arrayList3.size()) {
                    C7819c c7819c = arrayList3.get(i2);
                    if (z) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + c7819c.f18677a);
                    }
                    if (c7819c.f18679c) {
                        if (z) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        i = i2;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        i = i2;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = resolveTypeIfNeeded;
                        int match = c7819c.f18677a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(c7819c);
                            c7819c.f18679c = true;
                            i2 = i + 1;
                            action = str;
                            arrayList3 = arrayList2;
                            resolveTypeIfNeeded = str2;
                        } else if (z) {
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : TransactionBreakDownItemType.DATA : "action" : "category"));
                        }
                    }
                    arrayList4 = arrayList;
                    i2 = i + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    resolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                        ((C7819c) arrayList5.get(i3)).f18679c = false;
                    }
                    this.f18672d.add(new C7818b(intent, arrayList5));
                    if (!this.f18673e.hasMessages(1)) {
                        this.f18673e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
