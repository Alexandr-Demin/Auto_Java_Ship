package common;

import io.qase.api.QaseClient;
import io.qase.client.ApiClient;
import io.qase.client.api.ProjectsApi;
import io.qase.client.model.Project;

import java.util.List;

public class ProjectQaseIo extends TestNgApi{

    public String  addedApi(){
        ApiClient apiClient = QaseClient.getApiClient();
        apiClient.setApiKey("23bd0fcc93777392bcd396981ac44f38ef79d9eace4453a0f80b90d013391f0f");

    }
    public ProjectQaseIo addedProject(){
        ProjectsApi projectsApi = new ProjectsApi(addedApi);

        List<Project> projects = projectsApi.getProjects(100, 0).getResult().getEntities();
        return this;
    }
}
