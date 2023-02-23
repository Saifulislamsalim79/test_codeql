package ai.kudi.agent.notification.p013ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvp.MvpActivity;
import ai.kudi.agent.databinding.ActivityNotificationDetailsBinding;
import ai.kudi.agent.notification.data.model.NotificationModel;
import ai.kudi.agent.notification.data.model.NotificationModelKt;
import ai.kudi.agent.notification.presenters.NotificationDetailsPresenter;
import ai.kudi.agent.notification.views.NotificationDetailsView;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: NotificationDetailsActivity.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/notification/ui/NotificationDetailsActivity;", "Lai/kudi/agent/core/mvp/MvpActivity;", "Lai/kudi/agent/notification/views/NotificationDetailsView;", "Lai/kudi/agent/notification/presenters/NotificationDetailsPresenter;", "Lai/kudi/agent/databinding/ActivityNotificationDetailsBinding;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivityNotificationDetailsBinding;", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/notification/presenters/NotificationDetailsPresenter;", "setThisPresenter", "(Lai/kudi/agent/notification/presenters/NotificationDetailsPresenter;)V", "createPresenter", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.notification.ui.NotificationDetailsActivity */
/* loaded from: classes.dex */
public final class NotificationDetailsActivity extends MvpActivity<NotificationDetailsView, NotificationDetailsPresenter, ActivityNotificationDetailsBinding> implements NotificationDetailsView {
    public NotificationDetailsPresenter thisPresenter;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public NotificationDetailsPresenter createPresenter() {
        NotificationDetailsPresenter $r1 = getThisPresenter();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public /* bridge */ /* synthetic */ InterfaceC9413d createPresenter() {
        InterfaceC9413d $r1 = createPresenter();
        InterfaceC9413d r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public ActivityNotificationDetailsBinding getActivityBinding() {
        Activity r3 = (Activity) this;
        LayoutInflater $r1 = r3.getLayoutInflater();
        ActivityNotificationDetailsBinding $r2 = ActivityNotificationDetailsBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityNotificationDetailsBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final NotificationDetailsPresenter getThisPresenter() {
        NotificationDetailsPresenter $r1 = this.thisPresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("thisPresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity, p272h.p364d.p365a.p366c.AbstractC9409a
    public void onCreate(Bundle bundle) {
        Activity r17 = (Activity) this;
        Application $r3 = r17.getApplication();
        if ($r3 == null) {
            NullPointerException r16 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r16;
        }
        BaseApplication $r4 = (BaseApplication) $r3;
        ApplicationComponent $r5 = $r4.initializeComponent();
        $r5.inject(this);
        super.onCreate(bundle);
        AppCompatActivity r18 = (AppCompatActivity) this;
        AbstractC0925a $r6 = r18.getSupportActionBar();
        if ($r6 != null) {
            $r6.mo37602u(true);
        }
        Activity r172 = (Activity) this;
        Intent $r7 = r172.getIntent();
        boolean $z0 = $r7.hasExtra(NotificationModelKt.NOTIFICATION_SERIALIZABLE_KEY);
        if (!$z0) {
            Activity r173 = (Activity) this;
            r173.finish();
            return;
        }
        Activity r174 = (Activity) this;
        Intent $r72 = r174.getIntent();
        Serializable $r8 = $r72.getSerializableExtra(NotificationModelKt.NOTIFICATION_SERIALIZABLE_KEY);
        if ($r8 == null) {
            NullPointerException r162 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.notification.data.model.NotificationModel");
            throw r162;
        }
        NotificationModel $r9 = (NotificationModel) $r8;
        boolean $z02 = $r9.getMirrorStatus();
        if (!$z02) {
            NotificationDetailsPresenter $r10 = getThisPresenter();
            String $r11 = $r9.getId();
            NotificationDetailsActivity$onCreate$1 $r1 = NotificationDetailsActivity$onCreate$1.INSTANCE;
            $r10.updateNotificationStatus($r11, $r1);
        }
        String $r112 = $r9.getTitle();
        setTitle($r112);
        InterfaceC8209a $r12 = getBinding();
        ActivityNotificationDetailsBinding $r13 = (ActivityNotificationDetailsBinding) $r12;
        TextView $r14 = $r13.titleTextView;
        CharSequence $r113 = $r9.getTitle();
        TextView r19 = $r14;
        r19.setText($r113);
        InterfaceC8209a $r122 = getBinding();
        ActivityNotificationDetailsBinding $r132 = (ActivityNotificationDetailsBinding) $r122;
        TextView $r142 = $r132.notificationTextView;
        CharSequence $r114 = $r9.getMessage();
        TextView r192 = $r142;
        r192.setText($r114);
    }

    public final void setThisPresenter(NotificationDetailsPresenter notificationDetailsPresenter) {
        Log_OC.getArray(notificationDetailsPresenter, "<set-?>");
        this.thisPresenter = notificationDetailsPresenter;
    }
}
