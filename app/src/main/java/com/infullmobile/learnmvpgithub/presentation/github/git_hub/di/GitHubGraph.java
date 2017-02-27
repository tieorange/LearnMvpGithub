package com.infullmobile.learnmvpgithub.presentation.github.git_hub.di;

import android.support.annotation.VisibleForTesting;

import com.infullmobile.learnmvpgithub.presentation.github.git_hub.GitHubActivity;
import com.infullmobile.learnmvpgithub.presentation.application.di.ApplicationComponent;
import com.infullmobile.learnmvpgithub.presentation.application.di.Components;

import dagger.Component;

public class GitHubGraph {

	private final DaggerGitHubGraph_GitHubComponent.Builder builder;

	public GitHubGraph(GitHubActivity activity) {
		this.builder = DaggerGitHubGraph_GitHubComponent
				.builder()
				.applicationComponent(Components.from(activity.getApplication()))
				.gitHubModule(new GitHubModule(activity));
	}

	public void inject(GitHubActivity activity) {
		builder.build().inject(activity);
	}

	@VisibleForTesting
	public void setGitHubModule(GitHubModule module) {
		builder.gitHubModule(module);
	}

	@GitHubScope
	@Component(
			dependencies = ApplicationComponent.class,
			modules = GitHubModule.class
	)
	public interface GitHubComponent {
		void inject(GitHubActivity activity);
	}
}
