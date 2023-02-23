package p272h.p286c.p287a.p343d.p344a.p345a;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.play.core.common.InterfaceC4950a;
/* renamed from: h.c.a.d.a.a.g */
/* loaded from: classes2.dex */
final class C9334g implements InterfaceC4950a {

    /* renamed from: a */
    final /* synthetic */ Activity f21927a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9334g(Activity activity) {
        this.f21927a = activity;
    }

    @Override // com.google.android.play.core.common.InterfaceC4950a
    /* renamed from: a */
    public final void mo15020a(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        this.f21927a.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
