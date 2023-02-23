package p272h.p286c.p287a.p343d.p344a.p345a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.install.AbstractC4954a;
import com.google.android.play.core.internal.C4957a;
import p272h.p286c.p287a.p343d.p344a.p346b.AbstractC9356c;
/* renamed from: h.c.a.d.a.a.e */
/* loaded from: classes2.dex */
public final class C9332e extends AbstractC9356c<AbstractC4954a> {
    public C9332e(Context context) {
        super(new C4957a("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p272h.p286c.p287a.p343d.p344a.p346b.AbstractC9356c
    /* renamed from: a */
    public final void mo14975a(Context context, Intent intent) {
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            this.f21982a.m25957c("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        this.f21982a.m25957c("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            this.f21982a.m25957c("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        C4957a c4957a = this.f21982a;
        c4957a.m25957c("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        c4957a.m25957c("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
        c4957a.m25957c("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
        AbstractC4954a m25966a = AbstractC4954a.m25966a(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
        this.f21982a.m25957c("ListenerRegistryBroadcastReceiver.onReceive: %s", m25966a);
        m14974b(m25966a);
    }
}
