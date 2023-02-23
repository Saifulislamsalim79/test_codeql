package ai.kudi.agent.bills.adapters;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.bills.presenters.AnnouncementType;
import ai.kudi.agent.core.domain.room_entities.Announcement;
import ai.kudi.agent.databinding.ViewAnnouncementListItemBinding;
import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.viewpager.widget.AbstractC1904a;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: AnnouncementsPagerAdapter.kt */
@Metadata(m10422d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\u0010\u000bJ \u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u0018\u0010\u0017\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m10421d2 = {"Lai/kudi/agent/bills/adapters/AnnouncementsPagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "context", "Landroid/content/Context;", "announcements", "", "Lai/kudi/agent/core/domain/room_entities/Announcement;", "onItemClickListener", "Lkotlin/Function2;", "", "", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "destroyItem", "container", "Landroid/view/ViewGroup;", "position", "view", "", "getCount", "getPageTitle", "", "getPageWidth", "", "instantiateItem", "isViewFromObject", "", "Landroid/view/View;", "object", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AnnouncementsPagerAdapter extends AbstractC1904a {
    private final List<Announcement> announcements;
    private final Context context;
    private final InterfaceC11771p<Announcement, Integer, C13666w> onItemClickListener;

    public AnnouncementsPagerAdapter(Context context, List list, InterfaceC11771p interfaceC11771p) {
        Log_OC.getArray(context, "context");
        Log_OC.getArray(list, "announcements");
        Log_OC.getArray(interfaceC11771p, "onItemClickListener");
        this.context = context;
        this.announcements = list;
        this.onItemClickListener = interfaceC11771p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: instantiateItem$lambda-1$lambda-0  reason: not valid java name */
    public static final void m39016instantiateItem$lambda1$lambda0(AnnouncementsPagerAdapter announcementsPagerAdapter, Announcement announcement, Integer num, View view) {
        Log_OC.getArray(announcementsPagerAdapter, "this$0");
        Log_OC.getArray(announcement, "$announcement");
        InterfaceC11771p $r4 = announcementsPagerAdapter.onItemClickListener;
        $r4.invoke(announcement, num);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.viewpager.widget.AbstractC1904a
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Log_OC.getArray(viewGroup, "container");
        Log_OC.getArray(obj, "view");
        View $r3 = (View) obj;
        viewGroup.removeView($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.viewpager.widget.AbstractC1904a
    public int getCount() {
        List $r1 = this.announcements;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.viewpager.widget.AbstractC1904a
    public CharSequence getPageTitle(int i) {
        List $r1 = this.announcements;
        Object $r2 = $r1.get(i);
        Announcement $r3 = (Announcement) $r2;
        String $r4 = $r3.getTitle();
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.viewpager.widget.AbstractC1904a
    public float getPageWidth(int i) {
        List $r1 = this.announcements;
        int $i0 = $r1.size();
        return $i0 == 1 ? 1.0f : 0.9f;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.viewpager.widget.AbstractC1904a
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Integer $r14;
        Log_OC.getArray(viewGroup, "container");
        Context $r2 = this.context;
        LayoutInflater $r3 = LayoutInflater.from($r2);
        ViewAnnouncementListItemBinding $r4 = ViewAnnouncementListItemBinding.inflate($r3, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        List $r5 = this.announcements;
        Object $r6 = $r5.get(i);
        final Announcement $r7 = (Announcement) $r6;
        TextView $r8 = $r4.textMessage;
        String $r9 = $r7.getPreview();
        String $r10 = $r9;
        if ($r9 == null) {
            $r10 = $r7.getMessage();
        }
        Spanned $r11 = Html.fromHtml($r10);
        $r8.setText($r11);
        if ($r7.getPreview() == null) {
            TextView $r82 = $r4.textMessage;
            $r82.setMaxLines(3);
        }
        String $r92 = $r7.getType();
        AnnouncementType $r12 = AnnouncementType.ANNOUNCEMENT;
        String $r102 = $r12.name();
        boolean $z0 = Log_OC.append($r92, $r102);
        if ($z0) {
            ImageView $r13 = $r4.imageAnnouncement;
            $r13.setImageResource(C0001R.C0002drawable.ic_announcement);
            $r14 = Integer.valueOf((int) C0001R.C0002drawable.ic_announcement);
        } else {
            AnnouncementType $r122 = AnnouncementType.WARNING;
            String $r103 = $r122.name();
            boolean $z02 = Log_OC.append($r92, $r103);
            if ($z02) {
                ImageView $r132 = $r4.imageAnnouncement;
                $r132.setImageResource(C0001R.C0002drawable.ic_warning);
                TextView $r83 = $r4.textMessage;
                Context $r22 = this.context;
                int $i0 = C1335a.m36324d($r22, C0001R.color.redTextColor);
                $r83.setTextColor($i0);
                FrameLayout $r15 = $r4.getRoot();
                Context $r23 = this.context;
                Animation $r16 = AnimationUtils.loadAnimation($r23, C0001R.anim.shake);
                $r15.startAnimation($r16);
                $r14 = null;
            } else {
                AnnouncementType $r123 = AnnouncementType.ERROR;
                String $r104 = $r123.name();
                boolean $z03 = Log_OC.append($r92, $r104);
                if ($z03) {
                    ImageView $r133 = $r4.imageAnnouncement;
                    $r133.setImageResource(C0001R.C0002drawable.ic_error);
                    $r14 = Integer.valueOf((int) C0001R.C0002drawable.ic_error);
                } else {
                    ImageView $r134 = $r4.imageAnnouncement;
                    $r134.setImageResource(C0001R.C0002drawable.ic_error);
                    $r14 = Integer.valueOf((int) C0001R.C0002drawable.ic_error);
                }
            }
        }
        FrameLayout $r152 = $r4.getRoot();
        final Integer num = $r14;
        $r152.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.bills.adapters.h
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnnouncementsPagerAdapter $r24 = AnnouncementsPagerAdapter.this;
                Announcement $r32 = $r7;
                Integer $r42 = num;
                AnnouncementsPagerAdapter.m39016instantiateItem$lambda1$lambda0($r24, $r32, $r42, view);
            }
        });
        FrameLayout $r153 = $r4.getRoot();
        viewGroup.addView($r153);
        FrameLayout $r154 = $r4.getRoot();
        Log_OC.loadImage($r154, "viewAnnouncementListItemBinding.root");
        return $r154;
    }

    @Override // androidx.viewpager.widget.AbstractC1904a
    public boolean isViewFromObject(View view, Object obj) {
        Log_OC.getArray(view, "view");
        Log_OC.getArray(obj, "object");
        return view == obj;
    }
}
