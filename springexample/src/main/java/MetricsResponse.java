import java.util.List;

public class MetricsResponse {
    private Paging paging;
    private List<Measure> measures;
	public Paging getPaging() {
		return paging;
	}
	public void setPaging(Paging paging) {
		this.paging = paging;
	}
	public List<Measure> getMeasures() {
		return measures;
	}
	public void setMeasures(List<Measure> measures) {
		this.measures = measures;
	}
	@Override
	public String toString() {
		return "MetricsResponse [paging=" + paging + ", measures=" + measures + "]";
	}

    
}