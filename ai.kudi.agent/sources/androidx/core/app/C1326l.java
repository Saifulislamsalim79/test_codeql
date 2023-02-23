package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.C1314k;
import androidx.core.content.C1342b;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p201g.p218e.C7523b;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: NotificationCompatBuilder.java */
/* renamed from: androidx.core.app.l */
/* loaded from: classes2.dex */
class C1326l implements InterfaceC1313j {

    /* renamed from: a */
    private final Context f4161a;

    /* renamed from: b */
    private final Notification.Builder f4162b;

    /* renamed from: c */
    private final C1314k.C1323e f4163c;

    /* renamed from: d */
    private RemoteViews f4164d;

    /* renamed from: e */
    private RemoteViews f4165e;

    /* renamed from: f */
    private final List<Bundle> f4166f = new ArrayList();

    /* renamed from: g */
    private final Bundle f4167g = new Bundle();

    /* renamed from: h */
    private int f4168h;

    /* renamed from: i */
    private RemoteViews f4169i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1326l(C1314k.C1323e c1323e) {
        Icon icon;
        List<String> list;
        List<String> m36364e;
        this.f4163c = c1323e;
        this.f4161a = c1323e.f4130a;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f4162b = new Notification.Builder(c1323e.f4130a, c1323e.f4118K);
        } else {
            this.f4162b = new Notification.Builder(c1323e.f4130a);
        }
        Notification notification = c1323e.f4126S;
        this.f4162b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, c1323e.f4138i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(c1323e.f4134e).setContentText(c1323e.f4135f).setContentInfo(c1323e.f4140k).setContentIntent(c1323e.f4136g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(c1323e.f4137h, (notification.flags & 128) != 0).setLargeIcon(c1323e.f4139j).setNumber(c1323e.f4141l).setProgress(c1323e.f4149t, c1323e.f4150u, c1323e.f4151v);
        if (Build.VERSION.SDK_INT < 21) {
            this.f4162b.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.f4162b.setSubText(c1323e.f4146q).setUsesChronometer(c1323e.f4144o).setPriority(c1323e.f4142m);
            Iterator<C1314k.C1315a> it = c1323e.f4131b.iterator();
            while (it.hasNext()) {
                m36367b(it.next());
            }
            Bundle bundle = c1323e.f4111D;
            if (bundle != null) {
                this.f4167g.putAll(bundle);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (c1323e.f4155z) {
                    this.f4167g.putBoolean("android.support.localOnly", true);
                }
                String str = c1323e.f4152w;
                if (str != null) {
                    this.f4167g.putString("android.support.groupKey", str);
                    if (c1323e.f4153x) {
                        this.f4167g.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f4167g.putBoolean("android.support.useSideChannel", true);
                    }
                }
                String str2 = c1323e.f4154y;
                if (str2 != null) {
                    this.f4167g.putString("android.support.sortKey", str2);
                }
            }
            this.f4164d = c1323e.f4115H;
            this.f4165e = c1323e.f4116I;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            this.f4162b.setShowWhen(c1323e.f4143n);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 19 && i < 21 && (m36364e = m36364e(m36362g(c1323e.f4132c), c1323e.f4129V)) != null && !m36364e.isEmpty()) {
            this.f4167g.putStringArray("android.people", (String[]) m36364e.toArray(new String[m36364e.size()]));
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f4162b.setLocalOnly(c1323e.f4155z).setGroup(c1323e.f4152w).setGroupSummary(c1323e.f4153x).setSortKey(c1323e.f4154y);
            this.f4168h = c1323e.f4123P;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f4162b.setCategory(c1323e.f4110C).setColor(c1323e.f4112E).setVisibility(c1323e.f4113F).setPublicVersion(c1323e.f4114G).setSound(notification.sound, notification.audioAttributes);
            if (Build.VERSION.SDK_INT < 28) {
                list = m36364e(m36362g(c1323e.f4132c), c1323e.f4129V);
            } else {
                list = c1323e.f4129V;
            }
            if (list != null && !list.isEmpty()) {
                for (String str3 : list) {
                    this.f4162b.addPerson(str3);
                }
            }
            this.f4169i = c1323e.f4117J;
            if (c1323e.f4133d.size() > 0) {
                Bundle bundle2 = c1323e.m36401c().getBundle("android.car.EXTENSIONS");
                bundle2 = bundle2 == null ? new Bundle() : bundle2;
                Bundle bundle3 = new Bundle(bundle2);
                Bundle bundle4 = new Bundle();
                for (int i2 = 0; i2 < c1323e.f4133d.size(); i2++) {
                    bundle4.putBundle(Integer.toString(i2), C1327m.m36359b(c1323e.f4133d.get(i2)));
                }
                bundle2.putBundle("invisible_actions", bundle4);
                bundle3.putBundle("invisible_actions", bundle4);
                c1323e.m36401c().putBundle("android.car.EXTENSIONS", bundle2);
                this.f4167g.putBundle("android.car.EXTENSIONS", bundle3);
            }
        }
        if (Build.VERSION.SDK_INT >= 23 && (icon = c1323e.f4128U) != null) {
            this.f4162b.setSmallIcon(icon);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f4162b.setExtras(c1323e.f4111D).setRemoteInputHistory(c1323e.f4148s);
            RemoteViews remoteViews = c1323e.f4115H;
            if (remoteViews != null) {
                this.f4162b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = c1323e.f4116I;
            if (remoteViews2 != null) {
                this.f4162b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = c1323e.f4117J;
            if (remoteViews3 != null) {
                this.f4162b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f4162b.setBadgeIconType(c1323e.f4119L).setSettingsText(c1323e.f4147r).setShortcutId(c1323e.f4120M).setTimeoutAfter(c1323e.f4122O).setGroupAlertBehavior(c1323e.f4123P);
            if (c1323e.f4109B) {
                this.f4162b.setColorized(c1323e.f4108A);
            }
            if (!TextUtils.isEmpty(c1323e.f4118K)) {
                this.f4162b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Iterator<C1328n> it2 = c1323e.f4132c.iterator();
            while (it2.hasNext()) {
                this.f4162b.addPerson(it2.next().m36347h());
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f4162b.setAllowSystemGeneratedContextualActions(c1323e.f4124Q);
            this.f4162b.setBubbleMetadata(C1314k.C1320d.m36408c(c1323e.f4125R));
            C1342b c1342b = c1323e.f4121N;
            if (c1342b != null) {
                c1342b.m36299a();
                throw null;
            }
        }
        if (c1323e.f4127T) {
            if (this.f4163c.f4153x) {
                this.f4168h = 2;
            } else {
                this.f4168h = 1;
            }
            this.f4162b.setVibrate(null);
            this.f4162b.setSound(null);
            int i3 = notification.defaults & (-2);
            notification.defaults = i3;
            int i4 = i3 & (-3);
            notification.defaults = i4;
            this.f4162b.setDefaults(i4);
            if (Build.VERSION.SDK_INT >= 26) {
                if (TextUtils.isEmpty(this.f4163c.f4152w)) {
                    this.f4162b.setGroup("silent");
                }
                this.f4162b.setGroupAlertBehavior(this.f4168h);
            }
        }
    }

    /* renamed from: b */
    private void m36367b(C1314k.C1315a c1315a) {
        Notification.Action.Builder builder;
        Bundle bundle;
        int i = Build.VERSION.SDK_INT;
        if (i < 20) {
            if (i >= 16) {
                this.f4166f.add(C1327m.m36355f(this.f4162b, c1315a));
                return;
            }
            return;
        }
        IconCompat m36422e = c1315a.m36422e();
        if (Build.VERSION.SDK_INT >= 23) {
            builder = new Notification.Action.Builder(m36422e != null ? m36422e.m36204p() : null, c1315a.m36418i(), c1315a.m36426a());
        } else {
            builder = new Notification.Action.Builder(m36422e != null ? m36422e.m36215e() : 0, c1315a.m36418i(), c1315a.m36426a());
        }
        if (c1315a.m36421f() != null) {
            for (RemoteInput remoteInput : C1329o.m36345b(c1315a.m36421f())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        if (c1315a.m36423d() != null) {
            bundle = new Bundle(c1315a.m36423d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", c1315a.m36425b());
        if (Build.VERSION.SDK_INT >= 24) {
            builder.setAllowGeneratedReplies(c1315a.m36425b());
        }
        bundle.putInt("android.support.action.semanticAction", c1315a.m36420g());
        if (Build.VERSION.SDK_INT >= 28) {
            builder.setSemanticAction(c1315a.m36420g());
        }
        if (Build.VERSION.SDK_INT >= 29) {
            builder.setContextual(c1315a.m36417j());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", c1315a.m36419h());
        builder.addExtras(bundle);
        this.f4162b.addAction(builder.build());
    }

    /* renamed from: e */
    private static List<String> m36364e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C7523b c7523b = new C7523b(list.size() + list2.size());
        c7523b.addAll(list);
        c7523b.addAll(list2);
        return new ArrayList(c7523b);
    }

    /* renamed from: g */
    private static List<String> m36362g(List<C1328n> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (C1328n c1328n : list) {
            arrayList.add(c1328n.m36348g());
        }
        return arrayList;
    }

    /* renamed from: h */
    private void m36361h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & (-2);
        notification.defaults = i;
        notification.defaults = i & (-3);
    }

    @Override // androidx.core.app.InterfaceC1313j
    /* renamed from: a */
    public Notification.Builder mo36368a() {
        return this.f4162b;
    }

    /* renamed from: c */
    public Notification m36366c() {
        Bundle m36427a;
        RemoteViews m36370f;
        RemoteViews m36372d;
        C1314k.AbstractC1325g abstractC1325g = this.f4163c.f4145p;
        if (abstractC1325g != null) {
            abstractC1325g.mo36374b(this);
        }
        RemoteViews m36371e = abstractC1325g != null ? abstractC1325g.m36371e(this) : null;
        Notification m36365d = m36365d();
        if (m36371e != null) {
            m36365d.contentView = m36371e;
        } else {
            RemoteViews remoteViews = this.f4163c.f4115H;
            if (remoteViews != null) {
                m36365d.contentView = remoteViews;
            }
        }
        if (Build.VERSION.SDK_INT >= 16 && abstractC1325g != null && (m36372d = abstractC1325g.m36372d(this)) != null) {
            m36365d.bigContentView = m36372d;
        }
        if (Build.VERSION.SDK_INT >= 21 && abstractC1325g != null && (m36370f = this.f4163c.f4145p.m36370f(this)) != null) {
            m36365d.headsUpContentView = m36370f;
        }
        if (Build.VERSION.SDK_INT >= 16 && abstractC1325g != null && (m36427a = C1314k.m36427a(m36365d)) != null) {
            abstractC1325g.mo36375a(m36427a);
        }
        return m36365d;
    }

    /* renamed from: d */
    protected Notification m36365d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f4162b.build();
        }
        if (i >= 24) {
            Notification build = this.f4162b.build();
            if (this.f4168h != 0) {
                if (build.getGroup() != null && (build.flags & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 0 && this.f4168h == 2) {
                    m36361h(build);
                }
                if (build.getGroup() != null && (build.flags & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 0 && this.f4168h == 1) {
                    m36361h(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.f4162b.setExtras(this.f4167g);
            Notification build2 = this.f4162b.build();
            RemoteViews remoteViews = this.f4164d;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f4165e;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f4169i;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f4168h != 0) {
                if (build2.getGroup() != null && (build2.flags & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 0 && this.f4168h == 2) {
                    m36361h(build2);
                }
                if (build2.getGroup() != null && (build2.flags & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 0 && this.f4168h == 1) {
                    m36361h(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.f4162b.setExtras(this.f4167g);
            Notification build3 = this.f4162b.build();
            RemoteViews remoteViews4 = this.f4164d;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f4165e;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f4168h != 0) {
                if (build3.getGroup() != null && (build3.flags & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 0 && this.f4168h == 2) {
                    m36361h(build3);
                }
                if (build3.getGroup() != null && (build3.flags & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 0 && this.f4168h == 1) {
                    m36361h(build3);
                }
            }
            return build3;
        } else if (i >= 19) {
            SparseArray<Bundle> m36360a = C1327m.m36360a(this.f4166f);
            if (m36360a != null) {
                this.f4167g.putSparseParcelableArray("android.support.actionExtras", m36360a);
            }
            this.f4162b.setExtras(this.f4167g);
            Notification build4 = this.f4162b.build();
            RemoteViews remoteViews6 = this.f4164d;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f4165e;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i >= 16) {
            Notification build5 = this.f4162b.build();
            Bundle m36427a = C1314k.m36427a(build5);
            Bundle bundle = new Bundle(this.f4167g);
            for (String str : this.f4167g.keySet()) {
                if (m36427a.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            m36427a.putAll(bundle);
            SparseArray<Bundle> m36360a2 = C1327m.m36360a(this.f4166f);
            if (m36360a2 != null) {
                C1314k.m36427a(build5).putSparseParcelableArray("android.support.actionExtras", m36360a2);
            }
            RemoteViews remoteViews8 = this.f4164d;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f4165e;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        } else {
            return this.f4162b.getNotification();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Context m36363f() {
        return this.f4161a;
    }
}
