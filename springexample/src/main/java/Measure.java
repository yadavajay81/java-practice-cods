import java.util.List;
class Measure {
    private String metric;
    private List<HistoryEntry> history;
	public String getMetric() {
		return metric;
	}
	public void setMetric(String metric) {
		this.metric = metric;
	}
	public List<HistoryEntry> getHistory() {
		return history;
	}
	public void setHistory(List<HistoryEntry> history) {
		this.history = history;
	}
	@Override
	public String toString() {
		return "Measure [metric=" + metric + "]";
	}

    
}