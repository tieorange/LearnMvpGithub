package com.infullmobile.learnmvpgithub.presentation.counter.di;

import android.support.annotation.VisibleForTesting;

import com.infullmobile.learnmvpgithub.presentation.counter.CounterActivity;

import dagger.Component;

public class CounterGraph {
/*
	private final DaggerCounterGraph_CounterComponent.Builder builder;

	public CounterGraph(CounterActivity activity) {
		this.builder = DaggerCounterGraph_CounterComponent
				.builder()
				.applicationComponent(Components.from(activity.getApplication()))
				.counterModule(new CounterModule(activity));
	}

	public void inject(CounterActivity activity) {
		builder.build().inject(activity);
	}

	@VisibleForTesting
	public void setCounterModule(CounterModule module) {
		builder.counterModule(module);
	}

	@CounterScope
	@Component(
			dependencies = ApplicationComponent.class,
			modules = CounterModule.class
	)
	public interface CounterComponent {
		void inject(CounterActivity activity);
	}*/
}
