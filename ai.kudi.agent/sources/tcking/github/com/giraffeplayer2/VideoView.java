package tcking.github.com.giraffeplayer2;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import p201g.p227h.p238l.InterfaceC7757v;
import p272h.p275b.p283c.p284a.C8231b;
/* loaded from: classes3.dex */
public class VideoView extends FrameLayout {

    /* renamed from: c */
    private InterfaceC14891g f33223c;

    /* renamed from: d */
    private InterfaceC14893i f33224d;

    /* renamed from: e */
    private ViewGroup f33225e;

    /* renamed from: f */
    private C14906p f33226f;

    public VideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33226f = C14906p.m38a();
        m205b(context);
    }

    /* renamed from: b */
    private void m205b(Context context) {
        Activity activity = (Activity) context;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33225e = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        m204c();
        setBackgroundColor(this.f33226f.m36c());
    }

    /* renamed from: c */
    private void m204c() {
        InterfaceC14891g mo77a = C14894j.m92g().m91h().mo77a(getContext(), this.f33226f);
        this.f33223c = mo77a;
        if (mo77a != null) {
            mo77a.mo103h(this);
        }
    }

    /* renamed from: a */
    public boolean m206a() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if ((parent instanceof AbsListView) || (parent instanceof InterfaceC7757v) || (parent instanceof ScrollView)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean m203d() {
        return C14894j.m92g().m86m(this.f33226f.m35d());
    }

    /* renamed from: e */
    public VideoView m202e(C14906p c14906p) {
        if (this.f33226f.m30i() != null && !this.f33226f.m30i().equals(c14906p.m30i())) {
            C14894j.m92g().m81r(this.f33226f.m35d());
        }
        this.f33226f = c14906p;
        return this;
    }

    public ViewGroup getContainer() {
        return this.f33225e;
    }

    public ImageView getCoverView() {
        return (ImageView) findViewById(C8231b.app_video_cover);
    }

    public InterfaceC14891g getMediaController() {
        return this.f33223c;
    }

    public C14863e getPlayer() {
        if (this.f33226f.m30i() != null) {
            return C14894j.m92g().m90i(this);
        }
        throw new RuntimeException("player uri is null");
    }

    public InterfaceC14893i getPlayerListener() {
        return this.f33224d;
    }

    public C14906p getVideoInfo() {
        return this.f33226f;
    }
}
