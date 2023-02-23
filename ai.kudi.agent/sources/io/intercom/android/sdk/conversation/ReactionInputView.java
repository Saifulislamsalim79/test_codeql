package io.intercom.android.sdk.conversation;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import io.intercom.android.sdk.commons.utilities.DeviceUtils;
import io.intercom.android.sdk.imageloader.LongTermImageLoader;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.android.sdk.utilities.ColorUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ReactionInputView extends LinearLayout {
    private static final float REACTION_SCALE = 2.5f;
    private static final int VIBRATION_DURATION_MS = 10;
    private final ColorFilter deselectedFilter;
    Integer highlightedViewIndex;
    private ReactionListener listener;
    private final LongTermImageLoader longTermImageLoader;
    private ReactionReply reactionReply;
    private final List<ImageView> reactionViews;
    int reactionsLoaded;
    private final View.OnTouchListener touchListener;
    private final Twig twig;
    private final Vibrator vibrator;

    public ReactionInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ReactionInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Twig $r3 = LumberMill.getLogger();
        this.twig = $r3;
        this.highlightedViewIndex = null;
        this.reactionsLoaded = 0;
        this.touchListener = new View.OnTouchListener() { // from class: io.intercom.android.sdk.conversation.ReactionInputView.2
            private final Rect touchRect;

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            {
                Rect $r2 = new Rect();
                this.touchRect = $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
                if (r4 != r3) goto L25;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private void handleTouchMove(android.view.MotionEvent r12) {
                /*
                    r11 = this;
                    io.intercom.android.sdk.conversation.ReactionInputView r0 = io.intercom.android.sdk.conversation.ReactionInputView.this
                    android.graphics.Rect r1 = r11.touchRect
                    r0.getHitRect(r1)
                    android.graphics.Rect r1 = r11.touchRect
                    float r2 = r12.getX()
                    int r3 = (int) r2
                    float r2 = r12.getY()
                    int r4 = (int) r2
                    boolean r5 = r1.contains(r3, r4)
                    if (r5 == 0) goto L90
                    r3 = 0
                L1a:
                    io.intercom.android.sdk.conversation.ReactionInputView r0 = io.intercom.android.sdk.conversation.ReactionInputView.this
                    int r4 = r0.getChildCount()
                    if (r3 >= r4) goto L9e
                    io.intercom.android.sdk.conversation.ReactionInputView r0 = io.intercom.android.sdk.conversation.ReactionInputView.this
                    android.view.View r6 = r0.getChildAt(r3)
                    android.graphics.Rect r1 = r11.touchRect
                    r6.getHitRect(r1)
                    android.graphics.Rect r1 = r11.touchRect
                    float r2 = r12.getX()
                    int r4 = (int) r2
                    float r2 = r12.getY()
                    int r7 = (int) r2
                    boolean r5 = r1.contains(r4, r7)
                    if (r5 == 0) goto L8d
                    io.intercom.android.sdk.conversation.ReactionInputView r0 = io.intercom.android.sdk.conversation.ReactionInputView.this
                    java.lang.Integer r8 = r0.highlightedViewIndex
                    if (r8 == 0) goto L4b
                    int r4 = r8.intValue()
                    if (r4 == r3) goto L58
                L4b:
                    io.intercom.android.sdk.conversation.ReactionInputView r0 = io.intercom.android.sdk.conversation.ReactionInputView.this
                    r0.vibrateForSelection()
                    io.intercom.android.sdk.conversation.ReactionInputView r0 = io.intercom.android.sdk.conversation.ReactionInputView.this
                    r9 = 1075838976(0x40200000, float:2.5)
                    r0.selectViewAtIndex(r9, r3)
                L58:
                    io.intercom.android.sdk.conversation.ReactionInputView r0 = io.intercom.android.sdk.conversation.ReactionInputView.this
                    java.lang.Integer r8 = r0.highlightedViewIndex
                    if (r8 != 0) goto L74
                    java.lang.Integer r8 = r0.getCurrentSelectedIndex()
                    if (r8 == 0) goto L85
                    int r4 = r8.intValue()
                    if (r4 == r3) goto L85
                    io.intercom.android.sdk.conversation.ReactionInputView r0 = io.intercom.android.sdk.conversation.ReactionInputView.this
                    int r4 = r8.intValue()
                    r0.deselectViewAtIndex(r4)
                    goto L85
                L74:
                    int r4 = r8.intValue()
                    if (r4 == r3) goto L85
                    io.intercom.android.sdk.conversation.ReactionInputView r0 = io.intercom.android.sdk.conversation.ReactionInputView.this
                    java.lang.Integer r8 = r0.highlightedViewIndex
                    int r4 = r8.intValue()
                    r0.deselectViewAtIndex(r4)
                L85:
                    io.intercom.android.sdk.conversation.ReactionInputView r0 = io.intercom.android.sdk.conversation.ReactionInputView.this
                    java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
                    r0.highlightedViewIndex = r8
                L8d:
                    int r3 = r3 + 1
                    goto L1a
                L90:
                    io.intercom.android.sdk.conversation.ReactionInputView r0 = io.intercom.android.sdk.conversation.ReactionInputView.this
                    java.lang.Integer r8 = r0.highlightedViewIndex
                    if (r8 == 0) goto L99
                    r0.highlightSelectedReaction()
                L99:
                    io.intercom.android.sdk.conversation.ReactionInputView r0 = io.intercom.android.sdk.conversation.ReactionInputView.this
                    r10 = 0
                    r0.highlightedViewIndex = r10
                L9e:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.conversation.ReactionInputView.View$OnTouchListenerC102412.handleTouchMove(android.view.MotionEvent):void");
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int $i0 = motionEvent.getActionMasked();
                if ($i0 != 0) {
                    if ($i0 == 1) {
                        ReactionInputView $r32 = ReactionInputView.this;
                        $r32.handleTouchUp();
                        return true;
                    } else if ($i0 != 2) {
                        return true;
                    }
                }
                handleTouchMove(motionEvent);
                return true;
            }
        };
        ArrayList $r5 = new ArrayList();
        this.reactionViews = $r5;
        setVisibility(8);
        boolean $z0 = isInEditMode();
        if ($z0) {
            this.longTermImageLoader = null;
            this.vibrator = null;
        } else {
            LongTermImageLoader $r6 = LongTermImageLoader.newInstance(context);
            this.longTermImageLoader = $r6;
            Object $r7 = context.getSystemService("vibrator");
            Vibrator $r8 = (Vibrator) $r7;
            this.vibrator = $r8;
        }
        ColorFilter $r9 = ColorUtils.newGreyscaleFilter();
        this.deselectedFilter = $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    void deselectViewAtIndex(int i) {
        List $r1 = this.reactionViews;
        Object $r2 = $r1.get(i);
        ImageView $r3 = (ImageView) $r2;
        ViewPropertyAnimator $r4 = $r3.animate();
        OvershootInterpolator $r5 = new OvershootInterpolator(0.6f);
        $r4.setInterpolator($r5).scaleX(1.0f).scaleY(1.0f).setDuration(200L).start();
        ColorFilter $r6 = this.deselectedFilter;
        $r3.setColorFilter($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.Integer getCurrentSelectedIndex() {
        /*
            r11 = this;
            r0 = 0
        L1:
            int r1 = r11.getChildCount()
            if (r0 >= r1) goto L34
            io.intercom.android.sdk.models.ReactionReply r2 = r11.reactionReply
            java.lang.Integer r3 = r2.getReactionIndex()
            io.intercom.android.sdk.models.ReactionReply r2 = r11.reactionReply
            java.util.List r4 = r2.getReactionSet()
            java.lang.Object r5 = r4.get(r0)
            r7 = r5
            io.intercom.android.sdk.models.Reaction r7 = (io.intercom.android.sdk.models.Reaction) r7
            r6 = r7
            if (r3 == 0) goto L2f
            int r1 = r6.getIndex()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            boolean r9 = r3.equals(r8)
            if (r9 == 0) goto L2c
            goto L2f
        L2c:
            int r0 = r0 + 1
            goto L1
        L2f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            return r3
        L34:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.conversation.ReactionInputView.getCurrentSelectedIndex():java.lang.Integer");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
        if (r1 != r4) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void handleTouchUp() {
        /*
            r10 = this;
            java.lang.Integer r0 = r10.highlightedViewIndex
            if (r0 == 0) goto L5a
            int r1 = r0.intValue()
            if (r1 < 0) goto L5a
            java.lang.Integer r0 = r10.highlightedViewIndex
            int r1 = r0.intValue()
            io.intercom.android.sdk.models.ReactionReply r2 = r10.reactionReply
            java.util.List r3 = r2.getReactionSet()
            int r4 = r3.size()
            if (r1 >= r4) goto L5a
            io.intercom.android.sdk.models.ReactionReply r2 = r10.reactionReply
            java.util.List r3 = r2.getReactionSet()
            java.lang.Integer r0 = r10.highlightedViewIndex
            int r1 = r0.intValue()
            java.lang.Object r5 = r3.get(r1)
            r7 = r5
            io.intercom.android.sdk.models.Reaction r7 = (io.intercom.android.sdk.models.Reaction) r7
            r6 = r7
            if (r6 == 0) goto L5a
            io.intercom.android.sdk.models.ReactionReply r2 = r10.reactionReply
            java.lang.Integer r0 = r2.getReactionIndex()
            if (r0 == 0) goto L4a
            int r1 = r6.getIndex()
            io.intercom.android.sdk.models.ReactionReply r2 = r10.reactionReply
            java.lang.Integer r0 = r2.getReactionIndex()
            int r4 = r0.intValue()
            if (r1 == r4) goto L5a
        L4a:
            io.intercom.android.sdk.models.ReactionReply r2 = r10.reactionReply
            int r1 = r6.getIndex()
            r2.setReactionIndex(r1)
            io.intercom.android.sdk.conversation.ReactionListener r8 = r10.listener
            if (r8 == 0) goto L5a
            r8.onReactionSelected(r6)
        L5a:
            r10.highlightSelectedReaction()
            r9 = 0
            r10.highlightedViewIndex = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.conversation.ReactionInputView.handleTouchUp():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void highlightSelectedReaction() {
        /*
            r11 = this;
            r0 = 0
        L1:
            int r1 = r11.getChildCount()
            if (r0 >= r1) goto L39
            io.intercom.android.sdk.models.ReactionReply r2 = r11.reactionReply
            java.lang.Integer r3 = r2.getReactionIndex()
            io.intercom.android.sdk.models.ReactionReply r2 = r11.reactionReply
            java.util.List r4 = r2.getReactionSet()
            java.lang.Object r5 = r4.get(r0)
            r7 = r5
            io.intercom.android.sdk.models.Reaction r7 = (io.intercom.android.sdk.models.Reaction) r7
            r6 = r7
            if (r3 == 0) goto L30
            int r1 = r6.getIndex()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            boolean r9 = r3.equals(r8)
            if (r9 == 0) goto L2c
            goto L30
        L2c:
            r11.deselectViewAtIndex(r0)
            goto L36
        L30:
            r10 = 1065353216(0x3f800000, float:1.0)
            r11.selectViewAtIndex(r10, r0)
        L36:
            int r0 = r0 + 1
            goto L1
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.conversation.ReactionInputView.highlightSelectedReaction():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        View.OnTouchListener $r1 = this.touchListener;
        setOnTouchListener($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setOnTouchListener(null);
        boolean $z0 = isInEditMode();
        if ($z0) {
            return;
        }
        LongTermImageLoader $r2 = this.longTermImageLoader;
        try {
            $r2.close();
        } catch (IOException $r3) {
            Twig $r1 = this.twig;
            StringBuilder $r4 = new StringBuilder();
            $r4.append("Couldn't close LongTermImageLoader: ");
            String $r5 = $r3.getMessage();
            $r4.append($r5);
            String $r52 = $r4.toString();
            Object[] $r6 = new Object[0];
            $r1.m13071d($r52, $r6);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void preloadReactionImages(io.intercom.android.sdk.models.ReactionReply r10, io.intercom.com.bumptech.glide.C10486i r11) {
        /*
            r9 = this;
            java.util.List r0 = r10.getReactionSet()
            java.util.Iterator r1 = r0.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r3 = r1.next()
            r5 = r3
            io.intercom.android.sdk.models.Reaction r5 = (io.intercom.android.sdk.models.Reaction) r5
            r4 = r5
            io.intercom.android.sdk.imageloader.LongTermImageLoader r6 = r9.longTermImageLoader
            java.lang.String r7 = r4.getImageUrl()
            r8 = 0
            r6.loadImage(r7, r8, r11)
            goto L8
        L21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.conversation.ReactionInputView.preloadReactionImages(io.intercom.android.sdk.models.ReactionReply, io.intercom.com.bumptech.glide.i):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    void selectViewAtIndex(float f, int i) {
        List $r2 = this.reactionViews;
        Object $r3 = $r2.get(i);
        ImageView $r4 = (ImageView) $r3;
        ViewPropertyAnimator $r5 = $r4.animate();
        OvershootInterpolator $r1 = new OvershootInterpolator(2.0f);
        $r5.setInterpolator($r1).scaleX(f).scaleY(f).setDuration(200L).start();
        $r4.clearColorFilter();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0021 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setUpReactions(io.intercom.android.sdk.models.ReactionReply r32, final boolean r33, io.intercom.android.sdk.conversation.ReactionListener r34, io.intercom.com.bumptech.glide.C10486i r35) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.conversation.ReactionInputView.setUpReactions(io.intercom.android.sdk.models.ReactionReply, boolean, io.intercom.android.sdk.conversation.ReactionListener, io.intercom.com.bumptech.glide.i):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    void vibrateForSelection() {
        Context $r1 = getContext();
        boolean $z0 = DeviceUtils.hasPermission($r1, "android.permission.VIBRATE");
        if ($z0) {
            Vibrator $r2 = this.vibrator;
            $r2.vibrate(10L);
        }
    }
}
