package tcking.github.com.giraffeplayer2;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import p272h.p275b.p283c.p285b.C8234a;
/* compiled from: BaseMediaController.java */
/* renamed from: tcking.github.com.giraffeplayer2.a */
/* loaded from: classes3.dex */
public abstract class AbstractC14855a extends C14862d implements InterfaceC14891g, Handler.Callback {

    /* renamed from: b */
    protected final Context f33227b;

    /* renamed from: c */
    protected final AudioManager f33228c;

    /* renamed from: d */
    protected C8234a f33229d;

    /* renamed from: e */
    protected int f33230e = 3000;

    /* renamed from: f */
    protected Handler f33231f = new Handler(Looper.getMainLooper(), this);

    /* renamed from: g */
    protected VideoView f33232g;

    /* renamed from: h */
    protected View f33233h;

    public AbstractC14855a(Context context) {
        this.f33227b = context;
        this.f33228c = (AudioManager) context.getSystemService("audio");
    }

    @Override // tcking.github.com.giraffeplayer2.InterfaceC14891g
    /* renamed from: h */
    public void mo103h(VideoView videoView) {
        this.f33232g = videoView;
        View mo189s = mo189s();
        this.f33233h = mo189s;
        this.f33229d = new C8234a(mo189s);
        mo190r(this.f33233h);
        this.f33232g.getContainer().addView(this.f33233h, new FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: r */
    protected abstract void mo190r(View view);

    /* renamed from: s */
    protected abstract View mo189s();
}
